package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;

public class FactoryStorage {
    private final Map<Detail, Integer> factoryStorage = new HashMap<>();

    public FactoryStorage() {
        factoryStorage.put(Detail.HEAD, 0);
        factoryStorage.put(Detail.TORSO, 0);
        factoryStorage.put(Detail.HAND, 0);
        factoryStorage.put(Detail.FEET, 0);
    }

    public int getDetailQuantity(Detail detail) {
        return factoryStorage.get(detail);
    }

    public void changeDetailQuantity(Detail detail, int quantity) {
        factoryStorage.replace(detail, quantity);
    }
}
