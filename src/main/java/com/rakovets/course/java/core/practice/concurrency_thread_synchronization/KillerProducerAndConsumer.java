package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class KillerProducerAndConsumer extends Thread{
    private final Store store;

    public KillerProducerAndConsumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(25000);
            store.kill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
