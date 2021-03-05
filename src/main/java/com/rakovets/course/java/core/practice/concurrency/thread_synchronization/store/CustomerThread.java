package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

public class CustomerThread implements Runnable {
    private final CustomerQueue queue;

    public CustomerThread(CustomerQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.addToQueueRandom();
    }
}
