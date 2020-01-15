package com.rakovets.java.multithreading.producer_consumer;

import java.util.LinkedList;

public class ProducerThread implements Runnable {
    Store store;
    private boolean isActive;

    public ProducerThread(Store store) {
        this.store = store;
        isActive = true;
    }

    @Override
    public void run() {
        while (isActive) {
            store.produce();
        }
    }
}
