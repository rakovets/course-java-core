package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
