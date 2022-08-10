package com.rakovets.course.java.core.example.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Faction extends Thread {
    private final List<Details> list = new ArrayList<>();
    private final Factory factory;
    Logger logger = Logger.getLogger(Faction.class.getName());

    public Faction(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        while (factory.isAlive()) {
            takeDetails();
            logger.info(list.toString());
        }
    }

    public void takeDetails() {
        try {
            list.addAll(factory.stealDetails());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public long makeRobots() {
        Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return map.values().stream().min(Comparator.comparing(Long::longValue)).orElse(0L);
    }
}
