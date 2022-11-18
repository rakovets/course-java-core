package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Store {
    private final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> numbers;
    private final int storeCapacity;
    private final Random random;

    public Store(Queue<Integer> numbers, int storeCapacity, Random random) {
        this.numbers = numbers;
        this.storeCapacity = storeCapacity;
        this.random = random;
    }

    synchronized void produce(int randomBound) {
        while (numbers.size() >= storeCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info("Queue is full");
            }
        }
        int addedNumber = random.nextInt(randomBound);
        numbers.add(addedNumber);
        logger.info(Thread.currentThread().getName() + " " + addedNumber +  " has been added");
        logger.info("Store size is " + numbers.size());
        notify();
    }

    synchronized void consume() {
        while (numbers.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info("Queue is empty");
            }
        }
        int removedNumber = numbers.remove();
        logger.info(Thread.currentThread().getName() + " " + removedNumber + " has been removed");
        logger.info("Store size is " + numbers.size());
        notify();
    }
}
