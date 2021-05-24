package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Storage {
    public boolean isDay = true;
    Random random = new Random();
    private final String head = "head";
    private final String torso = "torso";
    private final String hand = "hand";
    private final String feet = "feet";
    private Map<String, Integer> partsList = new HashMap<>(Map.of(
            head, 0,
            torso, 0,
            hand, 0,
            feet, 0
    ));

    public synchronized void produceParts() {
        while (!isDay) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        final int PARTS_EACH_DAY = 10;
        for (int i = 0; i < PARTS_EACH_DAY; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    partsList.put(head, partsList.get(head) + 1);
                    break;
                case 1:
                    partsList.put(torso, partsList.get(torso) + 1);
                    break;
                case 2:
                    partsList.put(hand, partsList.get(hand) + 1);
                    break;
                case 3:
                    partsList.put(feet, partsList.get(feet) + 1);
                    break;
            }
        }
        setDay(false);
        notifyAll();
    }

    public synchronized Map<String, Integer> getPartsToFactions() {
        while (isDay) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Map<String, Integer> partsListForFactions = new HashMap<>(Map.of(
                head, 0,
                torso, 0,
                hand, 0,
                feet, 0
        ));
        final int PARTS_EACH_DAY = 5;

        for (int i = 0; i < PARTS_EACH_DAY; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    if (partsList.get(head) > 0) {
                        partsList.replace(head, partsList.get(head) - 1);
                        partsListForFactions.put(head, partsListForFactions.get(head) + 1);
                    }
                    break;
                case 1:
                    if (partsList.get(torso) > 0) {
                        partsList.replace(torso, partsList.get(torso) - 1);
                        partsListForFactions.put(torso, partsListForFactions.get(torso) + 1);
                    }
                    break;
                case 2:
                    if (partsList.get(hand) > 0) {
                        partsList.replace(hand, partsList.get(hand) - 1);
                        partsListForFactions.put(hand, partsListForFactions.get(hand) + 1);
                    }
                    break;
                case 3:
                    if (partsList.get(feet) > 0) {
                        partsList.replace(feet, partsList.get(feet) - 1);
                        partsListForFactions.put(feet, partsListForFactions.get(feet) + 1);
                    }
                    break;
            }
        }
        setDay(true);
        notifyAll();
        return partsListForFactions;
    }

    public void printFactoryDayResult() {
        System.out.println("---Factory producing day result---\n " + partsList.toString());
    }

    public void setDay(boolean day) {
        isDay = day;
    }
}
