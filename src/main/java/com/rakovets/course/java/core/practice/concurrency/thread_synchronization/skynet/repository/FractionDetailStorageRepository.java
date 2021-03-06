package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;

import java.util.HashMap;
import java.util.Map;

public class FractionDetailStorageRepository {
    private final Map<Detail, Integer> fractionStorage = new HashMap<>();

    public FractionDetailStorageRepository() {
        fractionStorage.put(Detail.HEAD, 0);
        fractionStorage.put(Detail.TORSO, 0);
        fractionStorage.put(Detail.HAND, 0);
        fractionStorage.put(Detail.FEET, 0);
    }

    public int getDetailQuantity(Detail detail) {
        return fractionStorage.get(detail);
    }

    public void changeDetailQuantity(Detail detail, int quantity) {
        fractionStorage.replace(detail, quantity);
    }
}
