package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

public class ConsumerThread extends Thread {
    private final Store store;

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
