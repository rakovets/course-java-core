package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class DayPeriod {
    private int days;
    private World world;
    private Wednesday wednesday;

    public DayPeriod(int days, World world, Wednesday wednesday) {
        this.days = days;
        this.world = world;
        this.wednesday = wednesday;
    }

    Factory factory = new Factory();

    public void start() throws InterruptedException {
        while (days > 0) {
            days--;
            factory.createDetails();
            int firstFraction = new Random().nextInt(2);
            System.out.println("first clan is : " + firstFraction);

            Thread fractionWorld = new Thread(world,"Clan World");
            Thread fractionWednesday = new Thread(wednesday,"Clan Wednesday");

            if (firstFraction == 1) {
                fractionWorld.start();
                fractionWednesday.start();
            } else {
                fractionWednesday.start();
                fractionWorld.start();
            }
            System.out.println("sleep");
            fractionWorld.join();
            fractionWednesday.join();
        }
    }
}
