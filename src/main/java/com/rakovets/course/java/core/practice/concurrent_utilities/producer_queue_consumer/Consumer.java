package com.rakovets.course.java.core.practice.concurrent_utilities.producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final Container numbers;
    private final int MILLISECONDS_IN_SECOND = 1000;
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
                    Thread.sleep(number * MILLISECONDS_IN_SECOND);
                    bw.write(String.format("%s - %s - Thread sleep %d seconds\n", LocalDateTime.now(), Thread.currentThread().getName(), number));
                } else {
                    Thread.sleep(MILLISECONDS_IN_SECOND);
                    bw.write(String.format("%s - %s - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
                    break;
                }
            }
        } catch (IOException | InterruptedException exception) {
            logger.info(exception.getMessage());
        }
    }
}
