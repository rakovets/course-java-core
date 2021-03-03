package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FactoryStore {
    private final List<Details> store;

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
                    store.add(Details.HEAD);
                    break;
                case 1:
                    store.add(Details.TORSO);
                    break;
                case 2:
                    store.add(Details.HAND);
                    break;
                case 3:
                    store.add(Details.FEET);
                    break;
            }
        }
    }

    public synchronized List<Details> loot() {
        List<Details> looted = new LinkedList<>();
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

    public List<Details> getStore() {
        return store;
    }
}
