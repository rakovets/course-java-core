package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerThread implements Runnable {
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
        for (int i = 0; i <= 10; i++) {
            int v = random.nextInt();
            store.produce(v);
            logger.log(Level.INFO, name + " " + v);
        }
    }
}
