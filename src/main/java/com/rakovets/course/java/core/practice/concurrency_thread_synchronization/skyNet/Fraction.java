package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skyNet;

import java.util.Collections;
import java.util.LinkedList;

public class Fraction implements Runnable {
    private Storage storage;
    private int countRobot = 0;
    private LinkedList<RobotParts> robotPartFraction = new LinkedList<>();

    public Fraction(Storage storage, LinkedList<RobotParts> robotPartFraction) {
        this.storage = storage;
        this.robotPartFraction = robotPartFraction;
    }

    public int getCountRobot() {
        return countRobot;
    }

    private void makeRobot() {
        LinkedList<RobotParts> robotModel= new LinkedList<>();
        Collections.addAll(robotModel, RobotParts.HAND, RobotParts.HAND, RobotParts.HEAD, RobotParts.FEET, RobotParts.FEET, RobotParts.TORSO);
        while (robotPartFraction.containsAll(robotModel)) {
            robotPartFraction.remove(RobotParts.HEAD);
            robotPartFraction.remove(RobotParts.HAND);
            robotPartFraction.remove(RobotParts.HAND);
            robotPartFraction.remove(RobotParts.TORSO);
            robotPartFraction.remove(RobotParts.FEET);
            robotPartFraction.remove(RobotParts.FEET);
            countRobot += 1;
        }
    }

    @Override
    public void run() {
        while (storage.isStatus(false)) {
            for (int i = 1; i <= storage.getLimitDays(); i++) {
                storage.getDetails(robotPartFraction);
            } makeRobot();
        }
    }
}
