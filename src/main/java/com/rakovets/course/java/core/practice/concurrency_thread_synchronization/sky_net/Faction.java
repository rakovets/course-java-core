package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.HashMap;
import java.util.Map;

public class Faction implements Runnable {
    private final GameController gameController;
    private final Factory factory;
    private final int maxContainsParts = 5;
    private final Map<String, Integer> partsStorage = new HashMap<>();
    private int numberOfRobots = 0;

    public Faction(GameController gameController, Factory factory) {
        this.gameController = gameController;
        this.factory = factory;
    }

    public void getPartFromFactory() {
        int dailyContainsParts = 0;
        String part = factory.getPart();
        while (part != null && dailyContainsParts < maxContainsParts) {
            if (partsStorage.containsKey(part)) {
                int partCount = partsStorage.get(part) + 1;
                partsStorage.put(part, partCount);
            } else {
                partsStorage.put(part, 1);
            }
            dailyContainsParts++;
            part = factory.getPart();
        }
    }

    public void makeRobot() {
        int headCount = partsStorage.get("head");
        int torsoCount = partsStorage.get("torso");
        int handCount = partsStorage.get("hand");
        int feetCount = partsStorage.get("feet");
        if (headCount > 0 && torsoCount > 0 && handCount > 1 && feetCount > 1) {
            partsStorage.put("head", headCount - 1);
            partsStorage.put("torso", torsoCount - 1);
            partsStorage.put("hand", handCount - 2);
            partsStorage.put("feet", feetCount - 2);
            numberOfRobots++;
            makeRobot();
        }
    }

    @Override
    public void run() {
        while (gameController.isGameRunning()) {
            if (gameController.getTimesOfDay().equals("night")) {
                getPartFromFactory();
            }
        }
        makeRobot();
        System.out.println(Thread.currentThread().getName() + " did robots: " + numberOfRobots);
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }
}
