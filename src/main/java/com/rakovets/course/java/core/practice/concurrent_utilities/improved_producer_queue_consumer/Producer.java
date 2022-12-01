package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    private static final Logger logger = Logger.getLogger(Producer.class.getName());

    private final Queue<Integer> numbers;

    public Producer(Queue<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int digitOfUserEnter = 0;
        while (true) {
            try {
                try {
                    digitOfUserEnter = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    throw new UserInputException(e.getMessage());
                }
                numbers.add(digitOfUserEnter);
                if (digitOfUserEnter == -1) {
                    break;
                }
                logger.log(Level.INFO, String.format("%d", digitOfUserEnter));
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "Error " + e);
            }
        }
        sc.close();
    }
}
