package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fraction extends Thread {
    private final Factory factory;
    private final List<Details> stock = new ArrayList<>();
    private final int detailCapacity;

    public Fraction(Factory factory, int detailCapacity) {
        this.factory = factory;
        this.detailCapacity = detailCapacity;
    }

    @Override
    public void run() {
        while (factory.isAlive()) {
            takeDetails();
        }
    }

    public void takeDetails() {
        stock.addAll(factory.consume(detailCapacity));
    }

    public long getCountOfRobots() {
        Map<Details, Long> detailsCount = stock.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return detailsCount.values().stream().min(Comparator.comparing(Long::longValue)).orElse(0L);
    }

    public String getWinnerFraction(Fraction fraction) {
        return this.getCountOfRobots() > fraction.getCountOfRobots() ?
                this.getName() + " WIN!" : fraction.getName() + " WIN!";
    }
}
