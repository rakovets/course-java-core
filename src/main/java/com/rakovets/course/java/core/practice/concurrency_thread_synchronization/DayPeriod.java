package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class DayPeriod {
    private int days;
    private World fractionWorld;
    private World wednesday;

    Factory factory = new Factory();

    public DayPeriod(int days) {
        this.days = days;
    }

    public void time() {
        while (days > 0) {
            factory.createDetails();
            int firstFraction = new Random().nextInt(1);
            if (firstFraction == 1) {

            }
        }
    }
}
