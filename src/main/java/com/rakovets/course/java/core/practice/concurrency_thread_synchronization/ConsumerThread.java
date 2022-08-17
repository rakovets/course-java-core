package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class ConsumerThread implements Runnable {
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            int number = store.consume();
            System.out.println(Thread.currentThread().getName() + ": consumed " + number);
        }
    }
}
