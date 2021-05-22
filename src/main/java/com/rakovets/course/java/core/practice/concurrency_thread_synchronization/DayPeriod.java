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


    public void start() throws InterruptedException {
        wednesday.setStatusWednesday(true);
        wednesday.setNightWednesday(false);
        world.setStatusWorld(true);
        world.setNightWorld(false);
        Factory factory = new Factory();

        factory.setNightFactory(false);
        factory.setStatusFactory(true);
        Thread fractionWorld = new Thread(world, "Clan World");
        Thread fractionWednesday = new Thread(wednesday, "Clan Wednesday");

        Thread threadFactory = new Thread(factory);
        threadFactory.start();
        fractionWednesday.start();
        fractionWorld.start();


        while (days > 0) {
            System.out.println(days);
            System.out.println("Wednesday's Count of robots : " + wednesday.getCountRobots());
            System.out.println("World's count of robots : " + world.getCountWorldRobotsRobots());
            Thread.sleep(10);
            int random = new Random().nextInt(2);
            System.out.println(random + " - random");
            if (random == 1) {
                world.setNightWorld(true);
                wednesday.setNightWednesday(true);
            } else {
                wednesday.setNightWednesday(true);
                world.setNightWorld(true);
            }
            Thread.sleep(10);
            factory.setNightFactory(false);
            days--;
            Thread.sleep(10);
        }
        world.setStatusWorld(false);
        wednesday.setStatusWednesday(false);
        factory.setStatusFactory(false);
    }
}
