package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.io.IOException;

    class Producer implements Runnable {
        Store store;

        Producer(Store store) {
            this.store = store;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    store.produce();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
