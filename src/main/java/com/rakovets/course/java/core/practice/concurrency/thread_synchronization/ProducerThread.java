package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

public class ProducerThread extends Thread {
    private final Store storage;

    public ProducerThread(Store storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        storage.produce();
    }
}
