package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());
    private final Container numbers;

    public Producer(Container queue) {
        this.numbers = queue;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter positive numbers. The end of queue is -1: ");
        int x = 0;
        while (x != -1) {
            try {
                x = Integer.parseInt(sc.nextLine());
                if (x < -1) {
                    throw new UserInputException("Try only positive number");
                } else {
                    numbers.addNumber(x);
                }
            } catch (UserInputException | IllegalArgumentException e) {
                logger.severe("Error: Incorrect input. " + e.getMessage());
                x = 0;
            }
        }
        sc.close();
    }
}
