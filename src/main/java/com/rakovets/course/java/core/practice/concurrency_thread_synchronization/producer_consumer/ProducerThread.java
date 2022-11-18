package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerThread implements Runnable {
    private static final int MAX_NUMBER = 10;
    private final Logger logger = Logger.getLogger(ProducerThread.class.getName());
    private final Store store;
    private final String name;

    public ProducerThread(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= MAX_NUMBER; i++) {
            int numberOfIterations = random.nextInt();
            store.produce(numberOfIterations);
            logger.log(Level.INFO, name + " " + numberOfIterations);
        }
    }
}
