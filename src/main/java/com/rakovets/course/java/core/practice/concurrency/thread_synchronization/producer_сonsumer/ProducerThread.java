package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_сonsumer;

public class ProducerThread implements Runnable {
    private Store store;

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
