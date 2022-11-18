package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

public class ConsumerThread implements Runnable {
    private final Store store;
    private final int threadAmounts;

    public ConsumerThread(Store store, int threadAmounts) {
        this.store = store;
        this.threadAmounts = threadAmounts;
    }

    public void run() {
        for (int i = 1; i < threadAmounts; i++) {
            store.consume();
        }
    }
}
