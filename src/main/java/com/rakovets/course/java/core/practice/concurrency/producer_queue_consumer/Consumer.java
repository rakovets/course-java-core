package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Consumer extends Thread {
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private QueueNumbersFromStream queue;

    private final int MILLS_IN_SECOND = 1000;

    public Consumer(String name, QueueNumbersFromStream queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("D://JavaProjects/course-java-core" +
                            "/src/main/java/com/rakovets/course/java/core/practice" +
                            "/concurrency/producer_queue_consumer/Report.txt", true));
            while (!queue.getQueueNumbers().isEmpty()) {
                if (!queue.getQueueNumbers().isEmpty()) {
                    int numberQueue = (int)queue.getQueueNumbers().poll();
                    Thread.sleep(numberQueue * MILLS_IN_SECOND);
                    writer.write(timestamp +
                            " - " + Thread.currentThread().getName() +
                            " - " + "I slept " + numberQueue + " seconds");
                    writer.newLine();
                    writer.flush();
                } else {
                    writer.write(timestamp +
                            " - " + Thread.currentThread().getName() +
                            " - " + "...");
                    writer.newLine();
                    writer.flush();
                    Thread.sleep(MILLS_IN_SECOND);
                }
            }
        } catch (IOException | InterruptedException | NullPointerException e) {
            e.getStackTrace();
        }
    }
}
