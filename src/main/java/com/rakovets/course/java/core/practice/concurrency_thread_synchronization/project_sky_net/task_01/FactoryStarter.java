package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public class FactoryStarter extends Thread {
    private FactoryStore factoryStore;
    public FactoryStarter(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        Thread factory = new Factory("Factory", factoryStore);
        factory.start();
    }
}
