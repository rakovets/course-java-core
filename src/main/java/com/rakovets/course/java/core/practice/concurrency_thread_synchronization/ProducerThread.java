package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class ProducerThread implements Runnable {
    private static final Random random = new Random();
    Store store = new Store();

    @Override
    public void run() {
        while (true) {
            store.produce();
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
