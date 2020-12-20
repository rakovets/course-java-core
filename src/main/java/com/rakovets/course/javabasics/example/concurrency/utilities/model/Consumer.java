package com.rakovets.course.javabasics.example.concurrency.utilities.model;

public class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            store.get();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
