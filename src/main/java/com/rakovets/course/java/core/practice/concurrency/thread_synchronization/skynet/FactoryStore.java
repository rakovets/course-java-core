package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FactoryStore {
    private final List<RoboParts> store;

    public FactoryStore() {
        this.store = new LinkedList<>();
    }

    public synchronized void produce() {
        Random random = new Random();
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
    }

    public synchronized List<RoboParts> loot() {
        List<RoboParts> looted = new LinkedList<>();
        while (!store.isEmpty()) {
                looted.add(store.remove(0));
                try {
                    wait(2);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        return looted;
    }

    public List<RoboParts> getStore() {
        return store;
    }
}
