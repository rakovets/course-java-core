package com.rakovets.course.javabasics.example.concurrency.utilities.model;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            store.put();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
