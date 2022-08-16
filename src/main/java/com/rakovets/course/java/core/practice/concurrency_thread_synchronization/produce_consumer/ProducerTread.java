package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerTread implements Runnable {
    public static final Logger LOGGER = Logger.getLogger("ProducerTread");

    private final Store store;

    public ProducerTread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            while (true) {
                int random = RandomUtil.getRandom(15);
                store.produce(random);
                store.notifyAll();
                try {
                    int randomWait = RandomUtil.getRandom();
                    String info = "Producer tread wait " + randomWait;
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
