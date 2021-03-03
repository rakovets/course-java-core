package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

public class Factory implements Runnable {
    private final FactoryStore store;

    public Factory(FactoryStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
