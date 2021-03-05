package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.LinkedList;

public class Worker extends Thread {
    private final LinkedList<Integer> request;
    private final String resultDestination;

    public Worker(LinkedList<Integer> request, String resultDestination) {
        this.request = request;
        this.resultDestination = resultDestination;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.resultDestination))) {
            boolean runner = true;
            do {
                try {
                    if (request.isEmpty()) {
                        bw.write(String.format("%s - ...\n", new Timestamp(System.currentTimeMillis()).toString()));
                        bw.flush();
                        Thread.sleep(1000L);
                    } else {
                        int seconds = request.poll();
                        if (seconds == -1) {
                            runner = false;
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
            } while (runner);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LinkedList<Integer> getRequest() {
        return request;
    }

    public String getResultDestination() {
        return resultDestination;
    }
}
