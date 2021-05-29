package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class RobotConstructor {
    private Map<Integer, Integer> partsOfRobots;

    public RobotConstructor(Map<Integer, Integer> partsOfRobots) {
        this.partsOfRobots = partsOfRobots;
    }

    public int makeRobots() {
        int[] details = new int[4];
        int[] numberOfKitsForRobots = new int[4];

        Set<Map.Entry<Integer, Integer>> collection = partsOfRobots.entrySet();
        collection.stream().forEach(x -> {
            details[x.getKey()] = x.getValue();
        });

        numberOfKitsForRobots[0] = details[0]; // number of sets of heads
        numberOfKitsForRobots[1] = details[1]; // number of sets of torso
        numberOfKitsForRobots[2] = details[2] / 2; // number of sets of hands
        numberOfKitsForRobots[3] = details[3] / 2; // number of sets of foot

        Arrays.sort(numberOfKitsForRobots);
        int minNumberOfRobot = numberOfKitsForRobots[0];
        return minNumberOfRobot;
    }
}
