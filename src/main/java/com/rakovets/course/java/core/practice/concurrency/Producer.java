package com.rakovets.course.java.core.practice.concurrency;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final Logger logger = Logger.getLogger(Producer.class.getName());
    private Queue<Integer> numbers;
    private boolean isActive = true;

    public Producer(Container numbers) {
        this.numbers = numbers.getNumbers();
    }

    public void disable() {
        isActive = false;
    }

    Producer() {
        isActive = true;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a number: ");
        while (isActive) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number != -1) {
                    numbers.add(number);
                } else {
                    new Producer().disable();
                    logger.info("The program finished");
                    break;
                }
            } catch (UserInputException | IllegalArgumentException e) {
                logger.warning("Sorry! This is inappropriate value!" + e.getMessage());
                logger.severe(Arrays.toString(e.getStackTrace()));
            }
        }
        sc.close();
    }
}
