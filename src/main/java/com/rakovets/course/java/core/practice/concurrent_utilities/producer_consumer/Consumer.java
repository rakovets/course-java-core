package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final Path filePath = Paths.get("src", "test", "resources", "practice.concurrent_utilities", "Producer-Consumer.txt");
    private final Container numbers;
    private final int MILLS = 1000;

    public Consumer(Container queue) {
        this.numbers = queue;
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter(filePath.toString(), true);
            while (!Thread.currentThread().isInterrupted()) {
                if (!numbers.getQueue().isEmpty()) {
                    long seconds = numbers.getItem();
                    Thread.sleep(seconds * MILLS);
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + " - I slept " +
                            seconds + " seconds.\n");
                    writer.flush();
                } else {
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + " - ...\n");
                    writer.flush();
                    Thread.sleep(MILLS);
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            logger.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
