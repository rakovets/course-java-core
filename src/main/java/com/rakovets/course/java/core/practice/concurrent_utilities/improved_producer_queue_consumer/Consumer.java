package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final Container numbers;
    private String fileName;

    public Consumer(Container numbers, String fileName) {
        this.numbers = numbers;
        this.fileName = fileName;
    }

    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            Integer number;
            while (true) {
                number = numbers.getItem();
                if (number != null) {
                    Thread.sleep(number * 1000);
                    bw.write(String.format("%s - %s - I slept %d seconds\n", LocalDateTime.now(), Thread.currentThread().getName(), number));
                } else {
                    Thread.sleep(1000);
                    bw.write(String.format("%s - %s - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            logger.info(e.getMessage());
        }
    }
}
