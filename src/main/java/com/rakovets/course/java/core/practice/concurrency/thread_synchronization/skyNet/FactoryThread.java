package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

public class FactoryThread implements Runnable {
    private final Factory factory;

    public FactoryThread(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        factory.produceParts();
    }
}
