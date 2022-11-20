package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.*;
import java.util.stream.Collectors;

public class Timer implements Runnable {
    private Factory factory;
    private List<String> storage;

    public Timer(Factory factory, List<String> storage) {
        this.factory = factory;
        this.storage = storage;
    }

    public int getCountOfRobots(List<String> stock) {
        Map<String, Integer> detailsCount = new HashMap<>();
        Set<String> details = new HashSet<>(stock);

        for (String s : details) {
            int count = 0;
            for (String value : stock) {
                if (s.equals(value)) {
                    count++;
                }
            }
            detailsCount.put(s, count);
        }

        List<Integer> values = detailsCount.values().stream()
                .sorted()
                .collect(Collectors.toList());
        return values.get(0);
    }

    public List<String> getStorage() {
        return storage;
    }

    @Override
    public void run() {
        storage.add(factory.consume());
    }
}
