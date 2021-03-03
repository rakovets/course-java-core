package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer;

public class Consumer extends Thread {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
