package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public class FactoryStarter extends Thread {
    private final SpeedType high;
    private final String nameOfStartedThread;
    private final FactoryStore factoryStore;
    public FactoryStarter(String name, String nameOfStartedThread, FactoryStore factoryStore, SpeedType high) {
        super(name);
        this.nameOfStartedThread = nameOfStartedThread;
        this.factoryStore = factoryStore;
        this.high = high;
    }

    @Override
    public void run() {
        Thread factory = new Factory(nameOfStartedThread, factoryStore, high);
        factory.start();
    }
}
