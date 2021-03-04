package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_сonsumer;

import com.rakovets.course.java.core.example.concurrency.thread_synchronization.model.Consumer;

public class ConsumerThread implements Runnable {
    private Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.consume();
        }
    }
}
