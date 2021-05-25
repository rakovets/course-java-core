package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class CustomerThread extends Thread{
    private final Store store;

    public CustomerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
