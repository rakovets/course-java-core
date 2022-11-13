package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.*;
import java.util.stream.Collectors;

public class World implements Runnable {
    private Factory factory;
    private List<String> stock;

    public World(Factory factory, List<String> stock) {
        this.factory = factory;
        this.stock = stock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            stock.add(factory.consume());
        }
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

    public List<String> getStock() {
        return stock;
    }
}
