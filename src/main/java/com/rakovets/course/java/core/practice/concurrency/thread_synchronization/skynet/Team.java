package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

public class Team implements Runnable {
    protected final FactoryStore store;
    protected int numberOfRobots = 0;

    public Team(FactoryStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        numberOfRobots = store.loot();
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }

}
