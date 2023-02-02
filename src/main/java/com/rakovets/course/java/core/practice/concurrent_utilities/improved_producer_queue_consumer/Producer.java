package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());

    private final ConcurrentLinkedQueue<Integer> numbers;

    public Producer(ConcurrentLinkedQueue<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int digitOfUserEnter;
        while (true) {
            try {
                try {
                    digitOfUserEnter = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    throw new UserInputException(e.getMessage());
                }
                if (digitOfUserEnter == -1) {
                    logger.log(Level.INFO, "Producer is stop");
                    break;
                }
                numbers.add(digitOfUserEnter);
                //logger.log(Level.INFO, String.format("%d", digitOfUserEnter));
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "Error try again" + e);
            }
        }
        sc.close();
    }
}
