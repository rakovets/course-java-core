package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.Random;

public class ProducerThread implements Runnable {
    private final Store store;
    private final int maxValueNumber;

    public ProducerThread(Store store, int maxValueNumber) {
        this.store = store;
        this.maxValueNumber = maxValueNumber;
    }

    @Override
    public void run() {
        Random rd = new Random();
        for (int i = 0; i < store.getStoreCapacity(); i++) {
            store.produce(rd.nextInt(maxValueNumber));
        }
    }
}
