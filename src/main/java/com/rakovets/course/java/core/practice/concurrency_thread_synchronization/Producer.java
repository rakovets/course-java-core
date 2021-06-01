package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Producer extends Thread {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
