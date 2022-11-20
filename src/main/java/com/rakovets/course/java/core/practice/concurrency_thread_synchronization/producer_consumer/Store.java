package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Store {
    private static final Logger logger = Logger.getLogger(Store.class.getName());

    private List<Integer> numbers;
    private Random random;
    private final int MAX_STORE_CAPACITY = 10;

    /**
     * The method accepts and adds a prime number to the storage.
     * The maximum number of numbers that the Store can contain is 10.
     */
    public synchronized void produce() {
        while (numbers.size() >= MAX_STORE_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        int number = random.nextInt(100);
        numbers.add(number);
        logger.info(String.format("%s thread added number %s\n", Thread.currentThread().getName(), number));
        logger.info(String.format("Current capacity numbers in the Store: %s\n ", numbers.size()));
        notify();
    }

    /**
     * The method takes the number(s) from the Store (i.e. the number is removed from it).
     */
    public synchronized void consume() {
        while (numbers.size() < 1) {
            try {
                wait();
            } catch (InterruptedException exception) {
                logger.info(exception.getMessage());
            }
        }

        int number = numbers.remove(0);
        logger.info(String.format("%s thread removed number %s\n", Thread.currentThread().getName(), number));
        logger.info(String.format("Current capacity numbers in the Store: %s\n ", numbers.size()));
        notify();
    }

    public Store(List<Integer> numbers, Random random) {
        this.numbers = numbers;
        this.random = random;
    }
}
