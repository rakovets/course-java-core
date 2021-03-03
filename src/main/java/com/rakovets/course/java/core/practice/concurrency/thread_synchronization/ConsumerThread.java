package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

public class ConsumerThread extends Thread {
    private final Store storage;

    public ConsumerThread(Store storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        storage.consume();
    }
}
