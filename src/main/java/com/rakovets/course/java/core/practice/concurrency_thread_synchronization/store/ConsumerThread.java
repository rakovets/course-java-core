package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.Optional;

public class ConsumerThread implements Runnable {
    private final Store store;
    private final static int WAIT_READ_TIME = 3;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000 * WAIT_READ_TIME);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Optional<Integer> result = store.consume();
        }
    }
}
