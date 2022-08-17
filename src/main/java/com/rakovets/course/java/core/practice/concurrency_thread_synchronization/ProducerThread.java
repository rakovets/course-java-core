package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class ProducerThread implements Runnable {
    private final int numbersBound;
    private final Store store;

    public ProducerThread(Store store, int numbersBound) {
        this.store = store;
        this.numbersBound = numbersBound;
    }

    @Override
    public void run() {
        while (true) {
            int number = new Random().nextInt(numbersBound);
            store.produce(number);
            System.out.println(Thread.currentThread().getName() + ": added " + number + " to store");
        }
    }
}
