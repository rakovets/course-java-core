package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.Collections;
import java.util.LinkedList;

public class FactionThread implements Runnable {
    private final Factory factory;
    private final LinkedList<RoboParts> warehouse;
    private int numberOfRobots = 0;

    public FactionThread(Factory factory) {
        this.factory = factory;
        this.warehouse = new LinkedList<>();
    }

    @Override
    public void run() {
        warehouse.addAll(factory.consumeParts());
        getRobot();
    }

    public void getRobot() {
        LinkedList<RoboParts> robotPattern = new LinkedList<>();
        Collections.addAll(robotPattern, RoboParts.HEAD, RoboParts.HAND, RoboParts.HAND, RoboParts.TORSO, RoboParts.FEET, RoboParts.FEET);
        while (warehouse.containsAll(robotPattern)) {
            warehouse.removeAll(robotPattern);
            numberOfRobots += 1;
        }
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }
}
