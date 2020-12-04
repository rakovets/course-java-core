package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import java.util.Random;

public class ConsumerThread implements Runnable{
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            try {
                Thread.sleep(r.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.consume();
        }
    }
}
