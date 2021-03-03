package com.rakovets.course.java.core.practice.concurrency.common;

public class Produce extends Thread {
    private final Store store;

    public Produce(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }

}
