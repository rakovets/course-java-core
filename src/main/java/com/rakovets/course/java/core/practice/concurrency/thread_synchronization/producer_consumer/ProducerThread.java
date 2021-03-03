package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

public class ProducerThread implements Runnable {
    private final Store store;
    protected boolean isRun = true;

    public ProducerThread(Store store) {
        this.store = store;
    }

    public void run() {
        while (isRun) {
            store.produce();
            sleep();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
