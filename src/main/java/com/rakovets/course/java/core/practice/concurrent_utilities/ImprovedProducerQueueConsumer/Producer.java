package com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Producer.class.getName());
    private final Container numbers;

    public Producer(Container numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter a number: ");
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number != -1) {
                    numbers.add(number);
                } else {
                    LOGGER.info("The program has finished");
                    break;
                }
            } catch (UserInputException | IllegalArgumentException e) {
                LOGGER.warning("Sorry! This is inappropriate value!" + e.getMessage());
                LOGGER.severe(Arrays.toString(e.getStackTrace()));
            }
        }
        scanner.close();
    }
}
