package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;

public class FactoryProduceThread implements Runnable {
    private final Factory factory;

    public FactoryProduceThread(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        System.out.println("Start producing");
        factory.produceParts();
        factory.printFactoryDayResult();
        System.out.println("End producing");
    }
}
