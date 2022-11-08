package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Consumer extends Thread {
    private final int MILLS = 1000;
    QueueInput queueInputConsumer = new QueueInput();

    @Override
    public void run() {
        while (true) {
            for (Integer seconds : queueInputConsumer.getQueue()) {
                String file = "";
                if (seconds != null) {
                    try {
                        Thread.sleep(Math.abs(seconds) * MILLS);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                    String infoMessage = String.format("%s - %s - I slept %d seconds.", timeStamp, Thread.currentThread().getName(), seconds);
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        fileWriter.write(infoMessage);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                        String infoMessage = String.format("%s - %s - ...", timeStamp, Thread.currentThread().getName());
                        try {
                            FileWriter fileWriter = new FileWriter(file, true);
                            fileWriter.write(infoMessage);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
