package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ProducerThread implements Runnable {
    private Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            store.produce();
        }
    }
}
