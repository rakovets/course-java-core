package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Store {
    private static final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> numbers = new LinkedList<>();
    private final int storeCapacity;

    public Store(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }

    public synchronized void produce(int number) {
        while (numbers.size() >= storeCapacity) {
            logger.info(Thread.currentThread().getName() + " wait: store is full!");
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        numbers.add(number);
        System.out.printf("%s add number %s\n", Thread.currentThread().getName(), number);
        System.out.printf("Numbers in Store: %s\n ", numbers.size());
        notify();
    }

    public synchronized void consume() {
        while (numbers.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        int number = numbers.poll();
        System.out.printf("%s remove number %s\n", Thread.currentThread().getName(), number);
        System.out.printf("Numbers in Store: %s\n ", numbers.size());
        notify();
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }
}
