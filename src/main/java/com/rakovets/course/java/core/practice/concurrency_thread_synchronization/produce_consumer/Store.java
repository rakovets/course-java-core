package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Store {
    public static final Logger LOGGER = Logger.getLogger("Store");

    private final Queue<Integer> integers = new LinkedList<>();
    private final int maxStoredSize;

    public Store(int maxStoredSize) {
        this.maxStoredSize = maxStoredSize;
    }

    /**
     * Adding to Store.
     *
     * @param value element to be added.
     */
    public void produce(int value) {
        if (integers.size() < maxStoredSize) {
            integers.add(value);
            String info = "Added " + value + " to store. Size: " + integers.size();
            LOGGER.info(info);
        } else {
            LOGGER.info("Producer adds nothing to store.");
        }
    }

    /**
     * Removing an item from the Store.
     */
    public void consume() {
        if (!integers.isEmpty()) {
            int remove = integers.remove();
            String info = "Deleted " + remove + " from store. Size: " + integers.size();
            LOGGER.info(info);
        } else {
            LOGGER.info("Store is empty");
        }
    }
}
