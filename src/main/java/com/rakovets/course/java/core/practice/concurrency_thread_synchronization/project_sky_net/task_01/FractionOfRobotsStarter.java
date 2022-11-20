package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_sky_net.task_01;

import java.util.Map;

public class FractionOfRobotsStarter extends Thread {
    private final FactoryStore factoryStore;
    private final SpeedType middle;
    public FractionOfRobotsStarter(String name, FactoryStore factoryStore, SpeedType middle) {
        super(name);
        this.factoryStore = factoryStore;
        this.middle = middle;
    }

    @Override
    public void run() {
        Map<String, Integer> namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay = factoryStore.getNamesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay();
        for (Map.Entry<String, Integer> item : namesOfRobotsThreadAndNumberOfSpearsAllowedToTakePerDay.entrySet()) {
            new FractionOfRobots(item.getKey(), factoryStore, middle).start();
        }
    }
}
