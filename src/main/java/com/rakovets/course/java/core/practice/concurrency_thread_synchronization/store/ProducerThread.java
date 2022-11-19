package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store;

import java.util.Random;

public class ProducerThread implements Runnable{

    private final Store store;
    private final Random rand = new Random();
    private final static int WAIT_WRITE_TIME = 2;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            int item = rand.nextInt(10);
            boolean result;
            do {
                result = store.produce(item);
                try {
                    Thread.sleep(1000 * WAIT_WRITE_TIME);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while (!result);
        }
    }
}
