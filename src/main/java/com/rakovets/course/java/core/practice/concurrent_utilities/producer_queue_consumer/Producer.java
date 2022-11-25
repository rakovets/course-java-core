package com.rakovets.course.java.core.practice.concurrent_utilities.producer_queue_consumer;

import java.awt.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());
    private final Container numbers;

    public Producer(Container numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int number = sc.nextInt();
                try {
                    if (number != -1) {
                        numbers.addItem(number);
                    } else {
                        logger.info("Producer was closed");
                        sc.close();
                        return;
                    }
                } catch (NumberFormatException exception) {
                    throw new InputException("Only integer numbers");
                }
            } catch (InputException exception) {
                logger.info(exception.getMessage());
            }
        }
    }
}
