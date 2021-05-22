package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.Map;

public class World implements Runnable {
    private static int countRobots = 0;
    private static Map<Details, Integer> details = new HashMap<>();

    {
        details.put(Details.HEAD, 0);
        details.put(Details.FEET, 0);
        details.put(Details.HAND, 0);
        details.put(Details.TORSO, 0);
    }

    public int getCountRobots() {
        return countRobots;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (Factory.getDetail().size() >= 1) {
                Details detail = Factory.getDetails();
                int newCount = 0;
                System.out.println(detail);
                if (details.containsKey(detail)) {
                    newCount = details.get(detail) + 1;

                    System.out.println();
                    System.out.println(" NEW COUNT = " + newCount);
                    System.out.println();
                }
                details.put(detail, newCount);
            }
        }
        createNewRobotsWorld();
    }

    public void createNewRobotsWorld() {
        System.out.println();
        System.out.println(Thread.currentThread().getName() + " " + " Heads " + details.get(Details.HEAD));
        System.out.println(Thread.currentThread().getName() + " " + " Torso " + details.get(Details.TORSO));
        System.out.println(Thread.currentThread().getName() + " " + " Feet " + details.get(Details.FEET));
        System.out.println(Thread.currentThread().getName() + " " + " Hand " + details.get(Details.HAND));
        System.out.println();

        while (details.get(Details.HEAD) > 1 && details.get(Details.FEET) > 2 && details.get(Details.HAND) > 2 &&
                details.get(Details.TORSO) > 1) {
            countRobots++;
            details.put(Details.HEAD, details.get(Details.HEAD) - 1);
            details.put(Details.FEET, details.get(Details.HEAD) - 2);
            details.put(Details.HAND, details.get(Details.HAND) - 2);
            details.put(Details.TORSO, details.get(Details.TORSO) - 1);
            System.out.println(countRobots);
        }
    }
}
