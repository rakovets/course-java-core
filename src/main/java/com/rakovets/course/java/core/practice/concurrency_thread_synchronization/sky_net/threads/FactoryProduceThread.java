package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.threads;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;

public class FactoryProduceThread implements Runnable {
    private final Factory factory;
    private final Storage storage;

    public FactoryProduceThread(Factory factory, Storage storage) {
        this.factory = factory;
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            factory.factoryStartWork();
            storage.printFactoryDayResult();
        }
    }
}
