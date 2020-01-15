package com.rakovets.java.multithreading.producer_consumer;

public class ConsumerThread implements Runnable {
    Store store;
    private boolean isActive;

    public ConsumerThread(Store store) {
        this.store = store;
        isActive = true;
    }

    @Override
    public void run() {
        while (isActive) {
            store.consume();
        }
    }
}
