package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

public class CashRegister implements Runnable {
    private final CustomerQueue queue;

    public CashRegister(CustomerQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.serveCustomer();
    }
}
