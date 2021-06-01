package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Clan implements Runnable {
    private int countRobots = 0;
    private boolean lifeStatus = true;
    private Map<Details, Integer> details = new HashMap<>();
    private final Map<Details, Integer> FULLPARTS = new HashMap<>();
    private List<Details> missingDetails = new LinkedList<>();

    {
        details.put(Details.HEAD, 0);
        details.put(Details.FEET, 0);
        details.put(Details.HAND, 0);
        details.put(Details.TORSO, 0);
        FULLPARTS.put(Details.HEAD, 1);
        FULLPARTS.put(Details.FEET, 2);
        FULLPARTS.put(Details.HAND, 2);
        FULLPARTS.put(Details.TORSO, 1);
    }

    public void run() {
        while (isStatus()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (DayCounter.isNight() && isStatus()) {
                selectMissingDetails();
                for (int j = 0; j < missingDetails.size(); j++) {
                    Details newDetail = Factory.getDetails(missingDetails.get(j));
                    if (newDetail != null) {
                        int newCount = details.get(newDetail) + 1;
                        details.put(newDetail, newCount);
                    }
                }
            }
        }
    }

    public void selectMissingDetails() {
        createNewRobots();
        missingDetails.clear();
        for (Map.Entry<Details, Integer> part : FULLPARTS.entrySet()) {
            if (FULLPARTS.get(part.getKey()) > details.get(part.getKey())) {
                missingDetails.add(part.getKey());
            }
        }
    }

    public void createNewRobots() {
        while (details.get(Details.HEAD) >= 1 && details.get(Details.FEET) >= 2 && details.get(Details.HAND) >= 2 &&
                details.get(Details.TORSO) >= 1) {
            countRobots++;
            details.put(Details.HEAD, details.get(Details.HEAD) - 1);
            details.put(Details.FEET, details.get(Details.FEET) - 2);
            details.put(Details.HAND, details.get(Details.HAND) - 2);
            details.put(Details.TORSO, details.get(Details.TORSO) - 1);
        }
    }

    public boolean isStatus() {
        return lifeStatus;
    }

    public void setStatus(boolean statusWorld) {
        this.lifeStatus = statusWorld;
    }

    public int getCountRobots() {
        return countRobots;
    }
}
