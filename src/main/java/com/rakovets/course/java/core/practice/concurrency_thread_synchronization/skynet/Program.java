package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class Program {
    public static void main(String[] args) {
        int numberOfDay = 10;

        Store store = new Store(numberOfDay);
        Factory factory = new Factory(store);
        Fraction world = new Fraction(store);
        Fraction wednesday = new Fraction(store);

        Thread factoryThread = new Thread(factory, "Factory");
        Thread worldThread = new Thread(world, "World");
        Thread wednesdayThread = new Thread(wednesday, "Wednesday");

        worldThread.start();
        wednesdayThread.start();
        factoryThread.start();

            try {
                factoryThread.join();
                worldThread.join();
                wednesdayThread.join();

           } catch (InterruptedException ex) {
                System.out.println("There were problems with the launch of streams of arbitrariness " +
                        "and the collection of parts.");
            }

        RobotConstructor worldRobots = new RobotConstructor(world.getPartsOfRobots());
        RobotConstructor wednesdayRobots = new RobotConstructor(wednesday.getPartsOfRobots());

        int numberWorldRobots = worldRobots.makeRobots();
        int numberWednesdayRobots = wednesdayRobots.makeRobots();

        System.out.println("It was the " + numberOfDay + "th day of the war. ");
        if (numberWorldRobots < numberWednesdayRobots) {
            System.out.println("The outcome of the battle was a foregone conclusion. The World fraction was defeated.");
            System.out.println("During this period of time, it was able to collect only " + numberWorldRobots + " combat robots.");
            System.out.println("By this time, the Wednesday fraction had " + numberWednesdayRobots + " combat units in stock.");
        } else if (numberWorldRobots > numberWednesdayRobots) {
            System.out.println("The world will not be the same. The victory of the Word fraction was inevitable.");
            System.out.println("his faction was able to assemble a deadly army of " + numberWorldRobots + " robots");
            System.out.println("The Wednesday Faction had only " + numberWednesdayRobots + " of them.");
        } else {
            System.out.println("The world did not get closer to the end of the war. The forces were equal.");
            System.out.println("Both factions have created " + numberWednesdayRobots + " battle robots.");
            System.out.println("This event leaves no chance for a quick end to the battle.");
        }
    }
}
