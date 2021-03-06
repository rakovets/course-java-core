package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service;

public class ProducerThreadService implements Runnable {
    private final StoreService store;
    protected boolean isRun = true;

    public ProducerThreadService(StoreService store) {
        this.store = store;
    }

    public void run() {
        while (isRun) {
            store.produce();
            sleep();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
