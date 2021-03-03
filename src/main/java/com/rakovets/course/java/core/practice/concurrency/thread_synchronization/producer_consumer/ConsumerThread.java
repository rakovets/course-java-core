package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

import java.util.Random;

public class ConsumerThread implements Runnable {
    private final Store store;
    protected boolean isRun = true;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        while (isRun) {
            sleep(new Random().nextInt(1000));
            store.consume();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
