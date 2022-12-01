package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());

    private final Queue<Integer> number;

    public Consumer(Queue<Integer> number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            if (!number.isEmpty()) {
                int c = number.peek();

            }
        }
    }
}
