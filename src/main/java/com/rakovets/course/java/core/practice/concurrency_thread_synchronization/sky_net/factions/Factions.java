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
    private Map<String, Integer> partsList = new HashMap<>(Map.of(
            head, 0,
            torso, 0,
            hand, 0,
            feet, 0
    ));

    public Factions(Storage storage) {
        this.storage = storage;
    }

    public void getPartsFromStorage() {
        partsList = storage.getPartsToFactions();
    }

    public void printAmountsPart() {
        System.out.println("---" + Thread.currentThread().getName() + "---\n " + partsList.toString());
    }
}
