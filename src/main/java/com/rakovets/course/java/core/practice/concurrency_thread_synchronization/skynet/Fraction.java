package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Fraction extends Thread {
    private static final Logger logger = Logger.getLogger(Fraction.class.getName());
    private final List<SkyNet.Details> list = new ArrayList<>();
    private final Factory factory;

    public Fraction(Factory factory) {
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
        int countSteal = 5;
        try {
            list.addAll(factory.stealDetails(countSteal));
        } catch (InterruptedException e) {
            logger.severe("Unexpected exception");
        }
    }

    public long makeRobots() {
        Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return map.values().stream().min(Comparator.comparing(Long::longValue)).orElse(0L);
    }
}
