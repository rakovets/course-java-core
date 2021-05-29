package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;

public class Fraction implements Runnable {
    private Store store;
     private Map<Integer,Integer> partsOfRobots = new HashMap<>();
     static int count = 0;

    public Fraction(Store store) {
        this.store = store;
     }

    public Map<Integer, Integer> getPartsOfRobots() {
        return partsOfRobots;
    }

    @Override
    public void run() {
        for (int i = 1; i <= store.getNumberOfDays(); i++) {
            store.getDetails(partsOfRobots);
        }
    }
}
