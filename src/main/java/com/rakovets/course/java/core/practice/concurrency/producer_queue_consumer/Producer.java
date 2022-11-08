package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Scanner;
import java.util.logging.Logger;

public class Producer implements Runnable {
    QueueInput queueInputProducer = new QueueInput();
    private final Logger logger = Logger.getLogger(Producer.class.getName());

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (!Thread.currentThread().isInterrupted()) {
            try {
                String inputString = scanner.nextLine();
                try {
                    int parsedInteger = Integer.parseInt(inputString);
                    if (parsedInteger != -1) {
                        queueInputProducer.addQueue(parsedInteger);
                        logger.info(String.valueOf(parsedInteger));
                    } else {
                        Thread.currentThread().interrupt();
                        scanner.close();
                        return;
                    }
                } catch (NumberFormatException exception) {
                    throw new UserInputException("Input value should be Integer");
                }
            } catch (Exception exception) {
                logger.info(exception.getMessage());
            }
        }
    }
}
