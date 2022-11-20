package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private Factory factory;
    private final String HEAD = "head";
    private final String TORSO = "torso";
    private final String HAND = "hand";
    private final String FEET = "feet";

    @Override
    public void run() {
        factory.produce(getRandomDetail());
    }

    public String getRandomDetail() {
        List<String> detail = new ArrayList<>();
        detail.add(HEAD);
        detail.add(TORSO);
        detail.add(HAND);
        detail.add(FEET);
        Random random = new Random();
        int index = random.nextInt(detail.size());
        return detail.get(index);
    }

    public Producer(Factory factory) {
        this.factory = factory;
    }
}
