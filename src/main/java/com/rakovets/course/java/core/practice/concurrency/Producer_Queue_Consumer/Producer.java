package com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final Logger logger = Logger.getLogger(Producer.class.getName());

    private final Queue<Integer> numbers;

    public Producer(Container numbers) {
        this.numbers = numbers.getNumbers();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a number: ");
        while (true) {
            try {
                int number = Integer.parseInt(String.valueOf(sc.nextInt()));
                if (number != -1) {
                    numbers.add(number);
                } else {
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
