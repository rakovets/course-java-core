package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;

import java.util.HashMap;
import java.util.Map;

public class FactoryDetailRepository {
    private final Map<Detail, Integer> factoryDetails = new HashMap<>();

    public FactoryDetailRepository() {
        factoryDetails.put(Detail.HEAD, 0);
        factoryDetails.put(Detail.TORSO, 0);
        factoryDetails.put(Detail.HAND, 0);
        factoryDetails.put(Detail.FEET, 0);
    }

    public int getDetailQuantity(Detail detail) {
        return factoryDetails.get(detail);
    }

    public void changeDetailQuantity(Detail detail, int quantity) {
        factoryDetails.replace(detail, quantity);
    }
}
