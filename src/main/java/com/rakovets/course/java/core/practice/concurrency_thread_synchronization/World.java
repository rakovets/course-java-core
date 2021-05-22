package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.Map;

public class World implements Runnable, GetDetailsFromFactory {
    private int countRobots;
    private Map<Details, Integer> detailsFractionWorld = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Factory.getDetails();
        }
    }


}
