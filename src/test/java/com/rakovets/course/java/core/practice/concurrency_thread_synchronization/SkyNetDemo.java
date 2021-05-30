package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        World world = new World();
        Wednesday wednesday = new Wednesday();
        Factory factory = new Factory();

        DayCounter dayCounter = new DayCounter(400, world, wednesday, factory);
        dayCounter.start();

        System.out.println("Wednesday's Count of robots : " + wednesday.getCountRobots());
        System.out.println("World's count of robots : " + world.getCountRobots());

        int countRobotsOfWednesday = wednesday.getCountRobots();
        int countRobotsOfWorld = world.getCountRobots();

        if (countRobotsOfWednesday > countRobotsOfWorld) {
            System.out.println("Wednesday has won.");
        } else if (countRobotsOfWorld > countRobotsOfWednesday) {
            System.out.println("World has won");
        } else System.out.println("Draw.");
    }
}
