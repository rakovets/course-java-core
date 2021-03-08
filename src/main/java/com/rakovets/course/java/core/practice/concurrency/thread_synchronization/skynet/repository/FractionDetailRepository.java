package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.Detail;

import java.util.HashMap;
import java.util.Map;

public class FractionDetailRepository {
    private final Map<Detail, Integer> fractionDetails = new HashMap<>();

    public FractionDetailRepository() {
        fractionDetails.put(Detail.HEAD, 0);
        fractionDetails.put(Detail.TORSO, 0);
        fractionDetails.put(Detail.HAND, 0);
        fractionDetails.put(Detail.FEET, 0);
    }

    public int getDetailQuantity(Detail detail) {
        return fractionDetails.get(detail);
    }

    public void changeDetailQuantity(Detail detail, int quantity) {
        fractionDetails.replace(detail, quantity);
    }
}
