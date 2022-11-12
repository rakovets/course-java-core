package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.*;
import java.util.logging.Logger;

public class Store {
    private final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> numbers = new LinkedList<>();
    private Random rnd = new Random();

    public synchronized void produce() {
        while (numbers.size() >= 10) {
            logger.info(Thread.currentThread().getName() + ", store is full!");
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        int addedNumber = rnd.nextInt(100);
        numbers.offer(addedNumber);
        logger.info(Thread.currentThread().getName() + " number " + addedNumber + " was added.");
        logger.info("Store size is " + numbers.size());
        notify();
    }

    public synchronized void consume() {
        while (numbers.isEmpty()) {
            logger.info(Thread.currentThread().getName() + ", store is empty!");
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        int removedNumber = numbers.poll();
        logger.info(Thread.currentThread().getName() + " number " + removedNumber + " was used.");
        notify();
    }

    public Queue<Integer> getNumbers() {
        return numbers;
    }
}
