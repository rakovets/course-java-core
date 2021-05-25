package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class ProducerThread extends Thread {
    private Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (store.getStatus()) {
            int random = new Random().nextInt();
            store.produce(random);
        }
    }
}
