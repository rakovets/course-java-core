package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.*;
import java.util.stream.Collectors;

public class World implements Runnable {
    private Factory factory;
    private List<String> storage;

    public World(Factory factory, List<String> stock) {
        this.factory = factory;
        this.storage = stock;
    }

    @Override
    public void run() {
        storage.add(factory.consume());
    }

    public int getCountOfRobots(List<String> stock) {
        Map<String, Integer> detailsAmount = new HashMap<>();
        Set<String> details = new HashSet<>(stock);

        for (String s : details) {
            int count = 0;
            for (String value : stock) {
                if (s.equals(value)) {
                    count++;
                }
            }
            detailsAmount.put(s, count);
        }

        List<Integer> values = detailsAmount.values().stream()
                .sorted()
                .collect(Collectors.toList());
        return values.get(0);
    }

    public List<String> getStorage() {
        return storage;
    }
}
