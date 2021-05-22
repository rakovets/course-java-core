package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class ConsumeThread implements Runnable {
    Random random = new Random();
    final private Store store;

    public ConsumeThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.consume();
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
