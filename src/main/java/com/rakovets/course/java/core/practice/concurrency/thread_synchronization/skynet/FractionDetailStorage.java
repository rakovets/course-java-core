package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.HashMap;
import java.util.Map;

public class FractionDetailStorage {
    private final Map<Detail, Integer> fractionStorage = new HashMap<>();

    public FractionDetailStorage() {
        fractionStorage.put(Detail.HEAD, 0);
        fractionStorage.put(Detail.TORSO, 0);
        fractionStorage.put(Detail.HAND, 0);
        fractionStorage.put(Detail.FEET, 0);
    }

    public int getDetailQuantity(Detail detail) {
        return fractionStorage.get(detail);
    }

    public void changeDetailQuantity(Detail detail, int oldQuantity, int newQuantity) {
        fractionStorage.replace(detail, oldQuantity, newQuantity);
    }
}
