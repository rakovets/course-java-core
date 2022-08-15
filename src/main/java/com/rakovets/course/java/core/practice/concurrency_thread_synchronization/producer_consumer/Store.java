package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Logger;

public class Store {
    private final static Queue<Integer> QUEUE = new ArrayDeque<>();
    Logger logger = Logger.getLogger(Store.class.getName());

    public void produce(int number) {
        synchronized (QUEUE) {
            if (QUEUE.size() < 10) {
                QUEUE.add(number);
                logger.info("Added " + number + "\n");
            }
        }
    }

    public void consume() {
        synchronized (QUEUE) {
            if (!QUEUE.isEmpty()) {
                int delete = QUEUE.poll();
                logger.info("Deleted " + delete + "\n");
            }
        }
    }
}
