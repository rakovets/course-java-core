package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.io.IOException;
import java.util.Random;

class Producer implements Runnable {
    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                store.produce(new Random().nextInt(51));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
