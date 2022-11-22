package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Timestamp;

public class Consumer extends Thread {
    private final int MILLS_IN_SECOND = 1000;

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private QueueNumbersFromStream queue;
    private Path filePath = Path.of("src",
            "test",
            "resources",
            "practice.concurrency",
            "Report.txt");

    public Consumer(String name, QueueNumbersFromStream queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(filePath.toFile(), true));
            while (!Thread.currentThread().isInterrupted()) {
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
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.getStackTrace();
        }
    }
}
