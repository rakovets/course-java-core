package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Store {
    private Queue<Integer> details = new LinkedList<>();
    private int numberOfDetails = 0;
    private int numberOfDays;

    public Store( int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public synchronized void makeDetails() {
        while (!details.isEmpty()) {
            try {
                notify();
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }

        while (numberOfDetails < 10) {
            int detail = (int) (Math.random() * 4);
            details.add(detail);
            numberOfDetails++;
        }
        numberOfDetails = 0;
        notify();
    }

    public synchronized void getDetails(Map<Integer, Integer> partsForRobots) {

        while (details.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }

        for (int j = 1; j <= 5; j++) {
            Integer detail = details.remove();

            if (partsForRobots.containsKey(detail)) {
                int value = partsForRobots.get(detail);
                partsForRobots.put(detail, value + 1);
            } else {
                partsForRobots.put(detail, 1);
            }
        }

        //This action is necessary for the task to meet the specification.
        //With this action, the fractions take the robot parts at the same time.
        Fraction.count++;
        while (Fraction.count % 2 != 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }
        notify();
    }
}
