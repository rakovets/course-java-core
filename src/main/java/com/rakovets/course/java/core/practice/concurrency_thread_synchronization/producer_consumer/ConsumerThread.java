package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class ConsumerThread implements Runnable {
    private Store store;
    private int numberOfConsumedNumbers;

    public ConsumerThread(Store store, int numberOfConsumedNumbers) {
        this.store = store;
        this.numberOfConsumedNumbers = numberOfConsumedNumbers;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numberOfConsumedNumbers; i++) {
            store.consumer();
        }
    }
}
