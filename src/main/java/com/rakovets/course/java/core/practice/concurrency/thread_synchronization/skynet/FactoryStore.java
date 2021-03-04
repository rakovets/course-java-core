package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FactoryStore {
    private final List<RoboParts> store;
    private final int maxDaysOfWork;
    private int currentDayOfWork;

    public FactoryStore(int maxDaysOfWork) {
        this.store = new LinkedList<>();
        this.maxDaysOfWork = maxDaysOfWork;
        this.currentDayOfWork = 0;
    }

    public synchronized void produce() {
        Random random = new Random();
        while (currentDayOfWork <= maxDaysOfWork) {
            while (!store.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            int consignmentOfDay = random.nextInt(11);
            for (int x = 0; x < consignmentOfDay; x++) {
                int detailDeterminer = random.nextInt(4);
                switch (detailDeterminer) {
                    case 0:
                        store.add(RoboParts.HEAD);
                        break;
                    case 1:
                        store.add(RoboParts.TORSO);
                        break;
                    case 2:
                        store.add(RoboParts.HAND);
                        break;
                    case 3:
                        store.add(RoboParts.FEET);
                        break;
                }
            }
            currentDayOfWork++;
            notifyAll();
        }
    }

    public synchronized int loot() {
        List<RoboParts> looted = new LinkedList<>();
        while (currentDayOfWork <= maxDaysOfWork) {
            try {
                while (store.isEmpty()) {
                    wait();
                }
                looted.add(store.remove(0));
                notifyAll();
                wait(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        return assembleRobots(looted);
    }

    public synchronized int smartLoot() {
        List<RoboParts> looted = new LinkedList<>();
        int numberOfRobots = 0;
        while (currentDayOfWork <= maxDaysOfWork) {
            numberOfRobots += assembleRobots(looted);
            try {
                while (store.isEmpty()) {
                    wait();
                }

                if (looted.isEmpty()) {
                    looted.add(store.remove(0));
                } else {
                    for(RoboParts part : RoboParts.values()) {
                        if (!looted.contains(part)) {
                            if (store.contains(part)) {
                                looted.add(part);
                                store.remove(part);
                            }
                        }
                    }
                    if(!store.isEmpty())
                        looted.add(store.remove(0));
                    }
                notifyAll();
                wait(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        return numberOfRobots;
    }

    private static int assembleRobots(List<RoboParts> roboParts) {
        int numberOfRobots = 0;
        if (!roboParts.isEmpty()) {
            while (roboParts.containsAll(RoboParts.getModel())) {
                roboParts.remove(RoboParts.HEAD);
                roboParts.remove(RoboParts.TORSO);
                roboParts.remove(RoboParts.HAND);
                roboParts.remove(RoboParts.HAND);
                roboParts.remove(RoboParts.FEET);
                roboParts.remove(RoboParts.FEET);
                numberOfRobots += 1;
            }
        }
        return numberOfRobots;
    }

    public List<RoboParts> getStore() {
        return store;
    }
}
