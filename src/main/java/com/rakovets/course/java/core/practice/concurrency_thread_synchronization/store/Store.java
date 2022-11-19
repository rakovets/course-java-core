package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.logging.Logger;

public class Store {
    public static final Logger logger = Logger.getLogger(Store.class.getName());
    private final Queue<Integer> QUEUE = new LinkedList<>();
    private final int maxQueueSize;

    public Store(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public synchronized boolean produce(Integer item) {
        boolean isAdded = false;
        if (QUEUE.size() < this.maxQueueSize) {
            QUEUE.add(item);
            isAdded = true;
            logger.info("Item " + item);
            logger.info("Store size: " + QUEUE.size());
            logger.info("has been added to queue from Thread:  " + Thread.currentThread().getName() + "\n");
        } else {
            System.out.println("Queue is full");
        }
        return isAdded;
    }

    public synchronized Optional<Integer> consume() {
        Integer result = QUEUE.poll();
        if (result == null) {
            logger.info("Store is empty! " + Thread.currentThread().getName() + "\n");
        } else {
            logger.info("Deleted " + result + " Store size: " + QUEUE.size() + " " + Thread.currentThread().getName());
        }
        return Optional.ofNullable(result);
    }
}
