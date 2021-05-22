package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.Map;

public class BountyHunter {
    private int countRobots = 0;
    private boolean statusWorld;
    private Map<Details, Integer> details = new HashMap<>();

    {
        details.put(Details.HEAD, 0);
        details.put(Details.FEET, 0);
        details.put(Details.HAND, 0);
        details.put(Details.TORSO, 0);
    }

    public void getDetails() {
        while (isStatus()) {
            for (int i = 0; i < Factory.getDetail().size(); i++) {
                if (DayPeriod.isNight() && isStatus()) {
                    System.out.println("Word Night!");
                    Details detailWorld = Factory.getDetails();
                    int newCount = 0;
                    if (details.containsKey(detailWorld)) {
                        newCount = details.get(detailWorld) + 1;
                    }
                    details.put(detailWorld, newCount);
                }
                createNewRobots();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void createNewRobots() {
        while (details.get(Details.HEAD) > 1 && details.get(Details.FEET) > 2 && details.get(Details.HAND) > 2 &&
                details.get(Details.TORSO) > 1) {
            countRobots++;
            details.put(Details.HEAD, details.get(Details.HEAD) - 1);
            details.put(Details.FEET, details.get(Details.HEAD) - 2);
            details.put(Details.HAND, details.get(Details.HAND) - 2);
            details.put(Details.TORSO, details.get(Details.TORSO) - 1);

        }

    }

    public boolean isStatus() {
        return statusWorld;
    }

    public void setStatus(boolean statusWorld) {
        this.statusWorld = statusWorld;
    }

    public int getCountRobots() {
        return countRobots;
    }
}
