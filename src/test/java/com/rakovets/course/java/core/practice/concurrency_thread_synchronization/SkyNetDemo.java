package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        int days = new Random().nextInt(100);
        System.out.println("Count days for farming : " + days);

        World world = new World();
        Wednesday wednesday = new Wednesday();

        DayPeriod dayPeriod = new DayPeriod(9999, world, wednesday);
        dayPeriod.start();

        System.out.println("Wednesday's Count of robots : " + wednesday.getCountRobots());
        System.out.println("World's count of robots : " + world.getCountRobots());
    }
}
