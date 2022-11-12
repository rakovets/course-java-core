package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.Random;

public class ProducerThread implements Runnable {
    private final Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            store.produce();
        }
    }
}
