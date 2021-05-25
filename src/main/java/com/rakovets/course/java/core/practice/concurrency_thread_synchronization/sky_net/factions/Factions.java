package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;
import java.util.HashMap;
import java.util.Map;

public class Factions {
    private final Storage storage;
    private final String head = "head";
    private final String torso = "torso";
    private final String hand = "hand";
    private final String feet = "feet";
    private final String robots = "robots";
    private Map<String, Integer> partsList = new HashMap<>(Map.of(
            head, 0,
            torso, 0,
            hand, 0,
            feet, 0,
            robots, 0
    ));

    public Factions(Storage storage) {
        this.storage = storage;
    }

    public void getPartsFromStorage() {
        Map<String, Integer> newParts = storage.getPartsFromStorage();
        for(String key : newParts.keySet()) {
            if (partsList.containsKey(key)) {
                partsList.put(key, partsList.get(key) + newParts.get(key));
            }
        }
    }

    public void createRobots() {
        if (partsList.get(head) >= 1 && partsList.get(torso) >= 1 && partsList.get(hand) >= 2 && partsList.get(feet) >= 2) {
            partsList.put(robots, partsList.get(robots) + 1);
            partsList.put(head, partsList.get(head) - 1);
            partsList.put(torso, partsList.get(torso) - 1);
            partsList.put(hand, partsList.get(hand) - 2);
            partsList.put(feet, partsList.get(feet) - 2);
        }
    }

    public void printAmountsPart() {
        System.out.println("---" + Thread.currentThread().getName() + "---\n " + partsList.toString() +
                "\nAmount robots: " + getAmountRobots());
    }

    public int getAmountRobots() {
        return partsList.get(robots);
    }
}
