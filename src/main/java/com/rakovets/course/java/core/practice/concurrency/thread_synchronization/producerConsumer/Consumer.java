package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.Store;

public class Consumer extends Thread {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
