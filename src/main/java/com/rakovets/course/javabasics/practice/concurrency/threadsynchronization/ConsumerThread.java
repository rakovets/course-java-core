package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import java.util.Random;

public class ConsumerThread implements Runnable {
    private final Store store;
    public ConsumerThread(Store store) {
        this.store = store;
    }
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.consume();
        }
    }
}
