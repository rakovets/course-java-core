package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 11 ; i++) {
            store.put();
        }
    }
}
