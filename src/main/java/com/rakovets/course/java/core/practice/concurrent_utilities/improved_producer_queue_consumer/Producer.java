package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    public static final Logger logger = Logger.getLogger(Producer.class.getName());

    private final QueueNumbersFromStream queue;

    public Producer(String name, QueueNumbersFromStream queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter integer positive number. To complete enter -1.");

        while (true) {
            try {
                try {
                    int input = scanner.nextInt();
                    if (input > -1) {
                        queue.addQueueNumbers(input);
                    } else if (input == -1) {
                        logger.info("Inputting completed.");
                        break;
                    }
                } catch (InputMismatchException e) {
                    throw new UserInputException("Incorrect input.");
                }
            } catch (UserInputException e) {
                logger.severe(e.getMessage());
                scanner.next();
            }
        }
        scanner.close();
    }
}
