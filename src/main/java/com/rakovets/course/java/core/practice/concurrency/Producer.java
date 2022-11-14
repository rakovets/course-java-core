package com.rakovets.course.java.core.practice.concurrency;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
    private final static Logger logger = Logger.getLogger(Producer.class.getName());
    private final QueueContainer queueContainer;

    public Producer(QueueContainer queueContainer) {
        this.queueContainer = queueContainer;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.log(Level.INFO, "Enter integer number: ");

        while (true) {
            try {
                int number = sc.nextInt();
                try {
                    if (number != -1) {
                        queueContainer.addItem(number);
                    } else {
                        logger.log(Level.INFO, "Producer was closed ");
                        sc.close();
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw new UserInputException("Warning! Enter only integer numbers!");
                }
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "ERROR " + e.getMessage());
            }
        }
    }
}
