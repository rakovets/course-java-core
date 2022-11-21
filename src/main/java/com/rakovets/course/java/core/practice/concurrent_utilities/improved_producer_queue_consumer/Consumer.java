package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private final static Logger logger = Logger.getLogger(Consumer.class.getName());
    private final int MILLS_IN_SECOND = 1000;

    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private QueueNumbersFromStream queue;
    private Path filePath = Path.of("src",
            "test",
            "resources",
            "practice.concurrent_utilities",
            "Report.txt");

    public Consumer(String name, QueueNumbersFromStream queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile(), true));
            while (!Thread.currentThread().isInterrupted()) {
                if (!queue.getQueueNumbers().isEmpty()) {
                    int numberQueue = queue.getQueueNumber();
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
            logger.severe(e.getMessage());
        }
    }
}
