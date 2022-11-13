package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private Factory factory;

    public Producer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            factory.produce(getRandomDetail());
        }
    }

    public String getRandomDetail() {
        List<String> detail = new ArrayList<>();
        detail.add("head");
        detail.add("torso");
        detail.add("hand");
        detail.add("feet");
        Random random = new Random();
        int position = random.nextInt(detail.size());
        return detail.get(position);
    }
}
