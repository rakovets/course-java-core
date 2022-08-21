package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        GameController gameController = new GameController(65);
        Factory factory = new Factory(gameController);
        Faction world = new Faction(gameController, factory);
        Faction wednesday = new Faction(gameController, factory);

        Thread factoryThread = new Thread(factory, "Factory");
        Thread worldThread = new Thread(world, "World");
        Thread wednesdayThread = new Thread(wednesday, "Wednesday");

        factoryThread.start();
        worldThread.start();
        wednesdayThread.start();

        factoryThread.join();
        worldThread.join();
        wednesdayThread.join();

        printWinner(world, wednesday);
    }

    private static void printWinner(Faction world, Faction wednesday) {
        if (world.getNumberOfRobots() > wednesday.getNumberOfRobots()) {
            System.out.println("World wins!");
        } else if (world.getNumberOfRobots() < wednesday.getNumberOfRobots()) {
            System.out.println("Wednesday wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}
