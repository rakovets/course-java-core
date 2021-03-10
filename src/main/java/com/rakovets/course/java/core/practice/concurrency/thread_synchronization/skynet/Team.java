package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;

public class Team implements Runnable {
    protected final FactoryStore store;
    protected int numberOfRobots = 0;

    public Team(FactoryStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        List<RoboPart> looted = new LinkedList<>();
        while (store.getCurrentDayOfWork() <= store.getMaxDaysOfWork()) {
            synchronized (store) {
                if (!store.isEmpty()) {
                    looted.add(store.pickUpFromStore());
                }
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        numberOfRobots = assembleRobots(looted);
    }

    protected static int assembleRobots(List<RoboPart> roboParts) {
        int numberOfRobots = 0;
        if (!roboParts.isEmpty()) {
            while (roboParts.containsAll(RoboPart.getModel())) {
                roboParts.remove(RoboPart.HEAD);
                roboParts.remove(RoboPart.TORSO);
                roboParts.remove(RoboPart.HAND);
                roboParts.remove(RoboPart.HAND);
                roboParts.remove(RoboPart.FEET);
                roboParts.remove(RoboPart.FEET);
                numberOfRobots += 1;
            }
        }
        return numberOfRobots;
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }
}
