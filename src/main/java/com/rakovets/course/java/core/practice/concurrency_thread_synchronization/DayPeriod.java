package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class DayPeriod {
    private int days;
    private World world;
    private Wednesday wednesday;
    private static boolean night = true;

    public static boolean isNight() {
        return night;
    }

    public static void setNight(boolean night) {
        DayPeriod.night = night;
    }

    public DayPeriod(int days, World world, Wednesday wednesday) {
        this.days = days;
        this.world = world;
        this.wednesday = wednesday;
    }


    public void start() throws InterruptedException {
        wednesday.setStatus(true);
        world.setStatus(true);

        Factory factory = new Factory();
        factory.setStatusFactory(true);

        Thread fractionWorld = new Thread(world, "Clan World");
        Thread fractionWednesday = new Thread(wednesday, "Clan Wednesday");

        Thread threadFactory = new Thread(factory);

        threadFactory.start();
        fractionWednesday.start();
        fractionWorld.start();


        while (days > 0) {
            System.out.println();
            System.out.println("Day = " + days);
            System.out.println("Period  - Day");
            setNight(false);

            // System.out.println("Wednesday's Count of robots : " + wednesday.getCountRobots());
            // System.out.println("World's count of robots : " + world.getCountWorldRobotsRobots());

            Thread.sleep(30);
            setNight(true);
            System.out.println("Period  - Night");
            Thread.sleep(30);
            days--;
        }
        world.setStatus(false);
        wednesday.setStatus(false);
        factory.setStatusFactory(false);
    }
}
