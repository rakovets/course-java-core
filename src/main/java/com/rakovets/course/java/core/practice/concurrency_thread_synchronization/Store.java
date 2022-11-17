package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Store {
    private final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> digits = new LinkedList<>();
    private static final int MAX_NUMBER = 10;

    public Store() {

    }

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
