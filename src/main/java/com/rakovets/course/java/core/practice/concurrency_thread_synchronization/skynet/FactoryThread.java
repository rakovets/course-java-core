package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class FactoryThread extends Thread {
    private Factory factory;

    public FactoryThread(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        while (factory.getDaysTerm() > 0) {
            factory.create();
        }
    }
}
