package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.Map;

public class World implements Runnable {
    private int countWorldRobots = 0;
    private Map<Details, Integer> detailsWorld = new HashMap<>();
    private boolean statusWorld;

    public boolean isStatusWorld() {
        return statusWorld;
    }

    public void setStatusWorld(boolean statusWorld) {
        this.statusWorld = statusWorld;
    }

    {
        detailsWorld.put(Details.HEAD, 0);
        detailsWorld.put(Details.FEET, 0);
        detailsWorld.put(Details.HAND, 0);
        detailsWorld.put(Details.TORSO, 0);
    }

    public int getCountWorldRobotsRobots() {
        return countWorldRobots;
    }

    @Override
    public void run() {
        while (isStatusWorld()) {

            for (int i = 0; i < Factory.getDetail().size(); i++) {
                if (DayPeriod.isNight() && isStatusWorld()) {
                    System.out.println(" Word Night!");
                  //  System.out.println(" Word Night!");
                    Details detailWorld = Factory.getDetails();
                    int newCount = 0;
                    if (detailsWorld.containsKey(detailWorld)) {
                        newCount = detailsWorld.get(detailWorld) + 1;
                    }
                    detailsWorld.put(detailWorld, newCount);
                }
            }
            createNewWorldRobots();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void createNewWorldRobots() {

        // System.out.println();
        // System.out.println(Thread.currentThread().getName() + " " + " Heads " + detailsWednesday.get(Details.HEAD));
        // System.out.println(Thread.currentThread().getName() + " " + " Torso " +detailsWednesday.get(Details.TORSO));
        // System.out.println(Thread.currentThread().getName() + " " + " Feet" + detailsWednesday.get(Details.FEET));
        // System.out.println(Thread.currentThread().getName() + " " + " Hand " + detailsWednesday.get(Details.HAND));
        //System.out.println();

        while (detailsWorld.get(Details.HEAD) > 1 && detailsWorld.get(Details.FEET) > 2 && detailsWorld.get(Details.HAND) > 2 &&
                detailsWorld.get(Details.TORSO) > 1) {
            countWorldRobots++;
            detailsWorld.put(Details.HEAD, detailsWorld.get(Details.HEAD) - 1);
            detailsWorld.put(Details.FEET, detailsWorld.get(Details.HEAD) - 2);
            detailsWorld.put(Details.HAND, detailsWorld.get(Details.HAND) - 2);
            detailsWorld.put(Details.TORSO, detailsWorld.get(Details.TORSO) - 1);
            //  System.out.println(countRobots);
        }

    }
}
