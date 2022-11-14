package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

public class FractionOfRobotsStarter extends Thread {
    private final FactoryStore factoryStore;
    public FractionOfRobotsStarter(String name, FactoryStore factoryStore) {
        super(name);
        this.factoryStore = factoryStore;
    }

    @Override
    public void run() {
        Thread fractionWorld = new FractionOfRobots("World", factoryStore);
        Thread fractionWednesday = new FractionOfRobots("Wednesday", factoryStore);
        fractionWorld.start();
        fractionWednesday.start();
    }
}
