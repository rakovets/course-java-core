package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public class FactoryStarter extends Thread {
    private String nameOfStartedThread;
    private FactoryStore factoryStore;
    public FactoryStarter(String name, String nameOfStartedThread, FactoryStore factoryStore) {
        super(name);
        this.nameOfStartedThread = nameOfStartedThread;
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        Thread factory = new Factory(nameOfStartedThread, factoryStore);
        factory.start();
    }
}
