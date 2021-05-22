package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class ProducerThread implements Runnable {
    final private Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.produce();
        }
    }
}
