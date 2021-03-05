package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.LinkedList;
import java.util.Random;

public class Factory {
    LinkedList<RoboParts> storage;
    private final int workingDaysLimit;
    private int currentWorkingDay;

    public Factory(int workingDaysLimit) {
        this.storage = new LinkedList<>();
        this.workingDaysLimit = workingDaysLimit;
        this.currentWorkingDay = 0;
    }

    public synchronized void produceParts() {
        Random random = new Random();
        while (currentWorkingDay <= workingDaysLimit) {
            if (storage.isEmpty()) {
                int batch = random.nextInt(11);
                for (int i = 0; i < batch; i++) {
                    int parts = random.nextInt(4);
                    switch (parts) {
                        case 0:
                            storage.add(RoboParts.HEAD);
                            break;
                        case 1:
                            storage.add(RoboParts.TORSO);
                            break;
                        case 2:
                            storage.add(RoboParts.HAND);
                            break;
                        case 3:
                            storage.add(RoboParts.FEET);
                            break;
                    }
                }
            currentWorkingDay++;
            }
            try {
                wait(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public synchronized LinkedList<RoboParts> consumeParts() {
        LinkedList<RoboParts> listOfParts = new LinkedList<>();
        while (currentWorkingDay <= workingDaysLimit) {
            if (!storage.isEmpty()) {
                for (int i = 0; i < 5; i++) {
                    if (!storage.isEmpty()) {
                        listOfParts.add(storage.removeFirst());
                        try {
                            wait(2);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
            try {
                wait(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        return listOfParts;
    }
}
