package com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Consumer.class.getName());
    private final Container numbers;
    private final String filePath;

    public Consumer(Container numbers, String filePath) {
        this.numbers = numbers;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            Integer sec;
            while (!Thread.currentThread().isInterrupted()) {
                int ONE_SEC_IN_MILLISECOND = 1000;
                sec = numbers.getItem();
                if (sec != null) {
                    Thread.sleep(sec * ONE_SEC_IN_MILLISECOND);
                    bufferedWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "I slept " + sec + "sec\n");
                    bufferedWriter.flush();
                } else {
                    Thread.sleep(ONE_SEC_IN_MILLISECOND);
                    bufferedWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "...\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException | InterruptedException e) {
            LOGGER.warning(e.getMessage());
        }
    }
}
