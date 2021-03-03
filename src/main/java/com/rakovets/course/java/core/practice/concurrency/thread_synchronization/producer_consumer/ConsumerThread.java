package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

public class ConsumerThread extends Thread {
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
