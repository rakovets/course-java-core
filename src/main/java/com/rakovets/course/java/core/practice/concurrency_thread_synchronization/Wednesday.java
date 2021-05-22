package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.Map;


public class Wednesday implements Runnable {
    private int countRobots = 0;
    private Map<Details, Integer> detailsWednesday = new HashMap<>();
    private boolean statusWednesday;

    public boolean isStatusWednesday() {
        return statusWednesday;
    }

    public void setStatusWednesday(boolean statusWednesday) {
        this.statusWednesday = statusWednesday;
    }


    {
        detailsWednesday.put(Details.HEAD, 0);
        detailsWednesday.put(Details.FEET, 0);
        detailsWednesday.put(Details.HAND, 0);
        detailsWednesday.put(Details.TORSO, 0);
    }

    public int getCountRobots() {
        return countRobots;
    }

    @Override
    public void run() {
        while (isStatusWednesday()) {

            for (int i = 0; i < Factory.getDetail().size(); i++) {
                if (DayPeriod.isNight() && isStatusWednesday()) {
                    System.out.println(" Word Night!");
                    //  System.out.println(" Word Night!");
                    Details detailWorld = Factory.getDetails();
                    int newCount = 0;
                    if (detailsWednesday.containsKey(detailWorld)) {
                        newCount = detailsWednesday.get(detailWorld) + 1;
                    }
                    detailsWednesday.put(detailWorld, newCount);
                }
            }
            createNewWednesdayRobots();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void createNewWednesdayRobots() {

        // System.out.println();
        // System.out.println(Thread.currentThread().getName() + " " + " Heads " + detailsWednesday.get(Details.HEAD));
        // System.out.println(Thread.currentThread().getName() + " " + " Torso " +detailsWednesday.get(Details.TORSO));
        // System.out.println(Thread.currentThread().getName() + " " + " Feet" + detailsWednesday.get(Details.FEET));
        // System.out.println(Thread.currentThread().getName() + " " + " Hand " + detailsWednesday.get(Details.HAND));
        //System.out.println();

        while (detailsWednesday.get(Details.HEAD) > 1 && detailsWednesday.get(Details.FEET) > 2 && detailsWednesday.get(Details.HAND) > 2 &&
                detailsWednesday.get(Details.TORSO) > 1) {
            countRobots++;
            detailsWednesday.put(Details.HEAD, detailsWednesday.get(Details.HEAD) - 1);
            detailsWednesday.put(Details.FEET, detailsWednesday.get(Details.HEAD) - 2);
            detailsWednesday.put(Details.HAND, detailsWednesday.get(Details.HAND) - 2);
            detailsWednesday.put(Details.TORSO, detailsWednesday.get(Details.TORSO) - 1);
            //  System.out.println(countRobots);
        }

    }
}
