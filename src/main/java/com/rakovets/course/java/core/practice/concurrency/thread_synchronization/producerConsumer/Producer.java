package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.Store;

public class Producer  extends Thread {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
