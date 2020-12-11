package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;


public class ProducerThread implements Runnable {
    private final Store store;
    public ProducerThread(Store store) {
        this.store = store;
    }
    public void run() {
        store.produce();
    }
}
