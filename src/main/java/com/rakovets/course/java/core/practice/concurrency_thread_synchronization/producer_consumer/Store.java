package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private static final int MAX_NUMBER = 10;
    private final Queue<Integer> digits = new LinkedList<>();


    public synchronized void produce(int number) {
        if (digits.size() <= MAX_NUMBER) {
            digits.add(number);
        }
    }

    public synchronized int consumer() throws UserInputException {
        if (digits.isEmpty()) {
            throw new UserInputException("WARNING");
        } else {
            return digits.poll();
        }
    }
}
