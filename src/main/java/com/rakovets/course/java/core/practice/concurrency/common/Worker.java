package com.rakovets.course.java.core.practice.concurrency.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;

public class Worker implements Runnable {
    private LinkedList<Integer> list;
    private String filepath;

    public Worker(LinkedList<Integer> list, String filepath) {
        this.list = list;
        this.filepath = filepath;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
            boolean stop = true;

            do {
                if (list.isEmpty()) {
                    bw.write(String.format("%s - ...\n", new Timestamp(System.currentTimeMillis()).toString()));
                    bw.flush();
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int seconds = list.poll();
                    if (seconds == -1) {
                        stop = false;
                    } else {
                        try {
                            Thread.sleep(seconds * 1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            bw.write(String.format("%s - I slept %d seconds\n",
                                    new Timestamp(System.currentTimeMillis()).toString(), seconds));
                            bw.flush();
                    }
                }
            } while (stop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
