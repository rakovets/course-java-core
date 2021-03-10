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
                try {
                    if (list.isEmpty()) {
                        bw.write(String.format("%s - ...\n", new Timestamp(System.currentTimeMillis()).toString()));
                        bw.flush();
                        Thread.sleep(1000L);
                    } else {
                        int seconds = list.poll();
                        if (seconds == -1) {
                            stop = false;
                        } else {
                            Thread.sleep(seconds * 1000L);
                            bw.write(String.format("%s - I slept %d seconds\n",
                                    new Timestamp(System.currentTimeMillis()).toString(), seconds));
                            bw.flush();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (stop);
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }
    }
}
