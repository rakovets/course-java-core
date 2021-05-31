package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class Producer implements Runnable {
    private Store store;
    int number;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce(number);
    }
}
