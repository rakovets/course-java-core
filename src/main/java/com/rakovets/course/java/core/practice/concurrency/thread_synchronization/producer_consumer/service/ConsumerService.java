package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service;

import java.util.Random;

public class ConsumerService implements Runnable {
    private final StoreService store;
    public boolean isRun = true;

    public ConsumerService(StoreService store) {
        this.store = store;
    }

    public void run() {
        while (isRun) {
            sleep(new Random().nextInt(1000));
            store.consume();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
