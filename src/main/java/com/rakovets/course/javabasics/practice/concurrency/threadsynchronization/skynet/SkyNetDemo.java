package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        final Fraction world = new World();
        final Fraction wednesday = new Wednesday();
        final Factory factory = new Factory();

        Thread factoryThread = new Thread(() -> factory.produce(100));

        Thread worldThread = new Thread(() -> factory.consume(100, world));

        Thread wednesdayThread = new Thread(() -> factory.consume(100, wednesday));

        factoryThread.start();
        worldThread.start();
        wednesdayThread.start();
        factoryThread.join();
        worldThread.join();
        wednesdayThread.join();

        int amountWorldRobots = world.getAmountRobots();
        int amountWednesdaydRobots = wednesday.getAmountRobots();

        System.out.println("Amount robots in World fraction: " + amountWorldRobots);
        System.out.println("Amount robots in Wednesday fraction: " + amountWednesdaydRobots);

        if (amountWorldRobots > amountWednesdaydRobots) {
            System.out.println("Army in World fraction is stronger");
        } else if (amountWorldRobots < amountWednesdaydRobots) {
            System.out.println("Army in Wednesday fraction is stronger");
        } else {
            System.out.println("Armies in World and Wednesday fractions are equals");
        }

    }
}
