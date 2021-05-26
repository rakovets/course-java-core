package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.Collections;
import java.util.LinkedList;

public class Fraction implements Runnable {
    private final Storage storage;
    private final LinkedList<RoboPart> warehouse;
    private int numberOfRobots = 0;

    public Fraction(Storage storage) {
        this.storage = storage;
        this.warehouse = new LinkedList<>();
    }

    @Override
    public void run() {
        while (storage.getCurrentWorkingDay() <= storage.getPreparatoryPeriodDays()) {
            synchronized (storage) {
                if (!storage.isStorageEmpty()) {
                    for (int i = 0; i < 5; i++) {
                        if (!storage.isStorageEmpty()) {
                            warehouse.add(storage.takePart());
                        }
                    }
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        getRobot();
    }

    public void getRobot() {
        LinkedList<RoboPart> robotPattern = new LinkedList<>();
        Collections.addAll(robotPattern, RoboPart.HEAD, RoboPart.HAND, RoboPart.HAND, RoboPart.TORSO, RoboPart.FEET, RoboPart.FEET);
        while (warehouse.containsAll(robotPattern)) {
            warehouse.remove(RoboPart.HEAD);
            warehouse.remove(RoboPart.HAND);
            warehouse.remove(RoboPart.HAND);
            warehouse.remove(RoboPart.TORSO);
            warehouse.remove(RoboPart.FEET);
            warehouse.remove(RoboPart.FEET);

            numberOfRobots += 1;
        }
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }
}
