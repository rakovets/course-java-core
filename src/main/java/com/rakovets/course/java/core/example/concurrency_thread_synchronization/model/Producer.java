package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

import java.util.Random;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        Random random = new Random();
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(random.nextInt(101));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.put();
        }
    }
}
