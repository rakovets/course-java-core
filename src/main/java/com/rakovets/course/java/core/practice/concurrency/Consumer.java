package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final Queue<Integer> numbers;
    private Path fileName;

    public Consumer(Queue<Integer> numbers, Path fileName) {
        this.numbers = numbers;
        this.fileName = fileName;
    }

    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName.toFile(), true))) {
            for (int number : numbers) {
                try {
                    Thread.sleep(number * 1000);
                    bw.write(String.format("%s - %s - I slept %d seconds\n", LocalDateTime.now(), Thread.currentThread().getName(), number));
                } catch (InterruptedException e) {
                    logger.info("Thread has been interrupted");
                }
            }
            try {
                Thread.sleep( 1000);
                bw.write(String.format("%s - %s - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
            } catch (InterruptedException e) {
                logger.info("Thread has been interrupted");
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
