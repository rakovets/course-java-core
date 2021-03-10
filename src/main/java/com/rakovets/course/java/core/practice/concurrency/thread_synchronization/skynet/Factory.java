package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.Random;

public class Factory implements Runnable {
    private final FactoryStore store;

    public Factory(FactoryStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (store.getCurrentDayOfWork() <= store.getMaxDaysOfWork()) {
            synchronized (store) {
                if (store.isEmpty()) {
                    int consignmentOfDay = random.nextInt(11);
                    for (int x = 0; x < consignmentOfDay; x++) {
                        int detailDeterminer = random.nextInt(4);
                        switch (detailDeterminer) {
                            case 0:
                                store.addToStore(RoboPart.HEAD);
                                break;
                            case 1:
                                store.addToStore(RoboPart.TORSO);
                                break;
                            case 2:
                                store.addToStore(RoboPart.HAND);
                                break;
                            case 3:
                                store.addToStore(RoboPart.FEET);
                                break;
                        }
                    }
                    store.updateCurrentDay();
                }
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
