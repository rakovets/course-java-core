package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Store {
    private final Logger logger = Logger.getLogger(Store.class.getName());
    private List<Integer> numbers;

    public void produce() {
        logger.info("Enter 10 positive numbers: ");
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        while (count <= 10) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    throw new UserInputException("Try only positive numbers");
                } else {
                    numbers.add(number);
                    count++;
                }
            } catch (UserInputException | IllegalArgumentException e) {
                logger.severe("Error: Incorrect input. " + e.getMessage());
                number = 0;
            }
        }
        sc.close();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
