package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

public class SmartTeam extends Team {
    public SmartTeam(FactoryStore store) {
        super(store);
    }

    @Override
    public void run() {
        parts.addAll(store.smartLoot(parts));
        assembleRobots();
    }
}
