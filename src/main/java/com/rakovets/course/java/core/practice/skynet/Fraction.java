package com.rakovets.course.java.core.practice.skynet;

import java.util.Collections;
import java.util.LinkedList;

public class Fraction implements Runnable {
    private final Storage storage;
    private final LinkedList<Detail> warehouse;
    private int numberOfRobots = 0;

    public Fraction(Storage storage) {
        this.storage = storage;
        this.warehouse = new LinkedList<>();
    }

    @Override
    public void run() {
        while (storage.getCurrentWorkingDay() <= storage.getWorkingDaysLimit()) {
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
        LinkedList<Detail> robotPattern = new LinkedList<>();
        Collections.addAll(robotPattern, Detail.head, Detail.hand, Detail.hand, Detail.torso, Detail.feet, Detail.feet);
        while (warehouse.containsAll(robotPattern)) {
            warehouse.remove(Detail.head);
            warehouse.remove(Detail.hand);
            warehouse.remove(Detail.hand);
            warehouse.remove(Detail.torso);
            warehouse.remove(Detail.feet);
            warehouse.remove(Detail.feet);

            numberOfRobots += 1;
        }
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }
}
