package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
