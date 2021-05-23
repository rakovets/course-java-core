package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.Collections;
import java.util.LinkedList;

public class Fraction implements Runnable {
    private int countRobot = 0;
    private LinkedList<RoboParts> roboPartFraction;
    private final Storage storage;

    public Fraction(Storage storage) {
        this.storage = storage;
        this.roboPartFraction = new LinkedList<>();
    }

    public int getCountRobot() {
        return countRobot;
    }

    private void makeRobot() {
        LinkedList<RoboParts> robotPattern = new LinkedList<>();
        Collections.addAll(robotPattern, RoboParts.HEAD, RoboParts.HAND, RoboParts.HAND,
                RoboParts.TORSO, RoboParts.FEET, RoboParts.FEET);
        while (roboPartFraction.containsAll(robotPattern)) {
            roboPartFraction.remove(RoboParts.HEAD);
            roboPartFraction.remove(RoboParts.HAND);
            roboPartFraction.remove(RoboParts.HAND);
            roboPartFraction.remove(RoboParts.TORSO);
            roboPartFraction.remove(RoboParts.FEET);
            roboPartFraction.remove(RoboParts.FEET);
            countRobot += 1;
        }
    }

    @Override
    public void run() {
        while (storage.getCurrentDay() <= storage.getDateLimit()) {
            synchronized (storage) {
                if (!storage.isStorageAmpty()) {
                    for (int i = 0; i < 5; i++) {
                        if (!storage.isStorageAmpty()) {
                            roboPartFraction.add(storage.takeRoboParts());
                        }
                    }
                }
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        makeRobot();
    }
}
