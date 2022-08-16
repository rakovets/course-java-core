package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumerThread implements Runnable {
    public static final Logger LOGGER = Logger.getLogger("ConsumerThread");

    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            while (true) {
                store.consume();
                store.notifyAll();
                try {
                    int randomWait = RandomUtil.getRandom();
                    String info = "Consumer thread wait " + randomWait;
                    LOGGER.info(info);
                    store.wait(randomWait);
                } catch (InterruptedException e) {
                    LOGGER.log(Level.WARNING, e.getMessage());
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
