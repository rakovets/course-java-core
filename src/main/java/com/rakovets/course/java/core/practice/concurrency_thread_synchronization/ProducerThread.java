package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class ProducerThread implements Runnable {
    private Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            int number = new Random().nextInt();
            store.produce(number);
            System.out.println(Thread.currentThread().getName() + ": added " + number + " to store");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
