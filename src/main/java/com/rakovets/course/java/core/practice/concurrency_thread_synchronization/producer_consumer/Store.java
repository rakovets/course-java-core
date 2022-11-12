package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Store {
    private final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> numbers = new LinkedList<>();

    public synchronized void produce() {
        logger.info("Enter 10 positive numbers: ");
        Scanner sc = new Scanner(System.in);
        while (numbers.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int number;
        int count = 0;
        while (count <= 10) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    throw new UserInputException("Try only positive numbers");
                } else {
                    numbers.offer(number);
                    count++;
                }
            } catch (UserInputException | IllegalArgumentException e) {
                logger.severe("Error: Incorrect input. " + e.getMessage());
                number = 0;
            }
        }
        sc.close();
    }

    public synchronized int consume() {
        while (numbers.isEmpty()) {
            logger.info(Thread.currentThread().getName() + ", store is empty!");
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        notify();
        return numbers.poll();
    }

    public Queue<Integer> getNumbers() {
        return numbers;
    }
}
