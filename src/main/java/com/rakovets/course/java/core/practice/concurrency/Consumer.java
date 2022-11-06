package com.rakovets.course.java.core.practice.concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private final int MILLS = 1000;
    private final Queue<Integer> numbers;
    private String fileName;

    public Consumer(Container queue, String fileName) {
        this.numbers = queue.getQueue();
        this.fileName = fileName;
    }

    public static final Logger logger = Logger.getLogger(Consumer.class.getName());

    public void run() {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            for (int number : numbers) {
                try {
                    Thread.sleep(number * MILLS);
                    fileWriter.write(String.format("%s - %s - I slept %d seconds\n", LocalDateTime.now(), Thread.currentThread().getName(), number));
                } catch (InterruptedException e) {
                    logger.info("Thread has been interrupted");
                }
                fileWriter.write(String.format("%s - %s - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
