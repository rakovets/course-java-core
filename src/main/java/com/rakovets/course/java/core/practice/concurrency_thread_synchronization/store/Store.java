package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

import static com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store.RandomNumbers.getRandom;

public class Store {
    public static final Logger logger = Logger.getLogger(Store.class.getName());
    private final static Queue<Integer> QUEUE = new LinkedList<>();
    private final int maxStoredSize;

    public Store(int maxStoredSize) {
        this.maxStoredSize = maxStoredSize;
    }

    public synchronized void produce() {
        while (QUEUE.size() < maxStoredSize) {
            QUEUE.add(getRandom());
            logger.info("Added value " + getRandom() + Thread.currentThread().getName() + "\n");
            logger.info("Store size: " + QUEUE.size());
        } if (QUEUE.size() == maxStoredSize) {
            logger.info("Store is full: " + QUEUE.size());
        }
    }

    public synchronized Integer consume() {
        int result = 0;
        for (int i = 0; i < maxStoredSize; i++) {
            if (!QUEUE.isEmpty()) {
                result = QUEUE.poll();
                logger.info("Deleted " + result + " Store size: " + QUEUE.size() + " " + Thread.currentThread().getName());
            } else {
                logger.info("Store is empty! " + Thread.currentThread().getName() + "\n");
            }
        }
        return result;
    }
}
