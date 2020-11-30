package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.LinkedList;

public class Factory {
    private LinkedList<Integer> details = new LinkedList<>();

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void produce(int days) throws InterruptedException {
        int counterDay = 1;
        while (counterDay < days) {
            int value = rnd(1, 10);
            synchronized (this) {
                details.add(value);
                counterDay++;
            }
        }
    }

    public int getDetails() {
        return details.size();
    }
}
