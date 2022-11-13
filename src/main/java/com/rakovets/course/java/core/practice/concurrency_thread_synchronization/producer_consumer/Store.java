package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Store {
    private static final Logger logger = Logger.getLogger(Store.class.getName());
    private Random rd = new Random();
    private List<Integer> numbers;

    public Store(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public synchronized void produce() {
        while (numbers.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        int number = rd.nextInt(100);
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
        int number = numbers.remove(0);
        System.out.printf("%s remove number %s\n", Thread.currentThread().getName(), number);
        System.out.printf("Numbers in Store: %s\n ", numbers.size());
        notify();
    }
}
