package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store.RandomNumbers.getRandom;

public class ProducerThread implements Runnable {
    public static final Logger logger = Logger.getLogger(ProducerThread.class.getName());
    private final Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.produce();
            try {
                store.wait(getRandom());
            } catch (InterruptedException e) {
                logger.log(Level.WARNING, e.getMessage());
            }
            store.notify();
        }
    }
}
