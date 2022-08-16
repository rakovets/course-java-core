package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class ConsumerThread implements Runnable {
    private Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            Integer number = store.consume();
            if (number != null) {
                System.out.println(Thread.currentThread().getName() + ": consumed " + number);
            } else {
                System.out.println(Thread.currentThread().getName() + ": store is empty!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
