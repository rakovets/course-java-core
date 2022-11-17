package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final Container numbers;
    private final String fileName;

    public Consumer(Container numbers, String fileName) {
        this.numbers = numbers;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            Integer number;
            while ((number = numbers.getItem()) != null) {
                Thread.sleep(number * 1000);
                bw.write(String.format("%s - %s - I slept %d seconds\n", LocalDateTime.now(), Thread.currentThread().getName(), number));
            }
            Thread.sleep(1000);
            bw.write(String.format("%s - %s - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
        } catch (IOException | InterruptedException e) {
            logger.info(e.getMessage());
        }
    }
}
