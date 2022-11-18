package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerThread implements Runnable {
    public static final Logger logger = Logger.getLogger(ConsumerThread.class.getName());

    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.consume();
            if (store.consume() != null) {
                try {
                    store.wait();
                } catch (InterruptedException e) {
                    logger.log(Level.WARNING, e.getMessage());
                }
            }
            store.notify();
        }
    }
}
