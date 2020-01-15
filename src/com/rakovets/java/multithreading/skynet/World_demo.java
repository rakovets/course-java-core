package com.rakovets.java.multithreading.skynet;

public class World_demo {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Factory factory = new Factory(warehouse);
        Wednesday wednesday = new Wednesday(warehouse);
        World world = new World(warehouse);
        for (int i = 0; i < 100; i++) {
            new Thread(factory, "Factory").start();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            new Thread(wednesday, "Group Wednesday").start();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            new Thread(world, "Group World").start();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        int countOfRobotsInWorldGroup = warehouse.countOfRobots(warehouse.worldRobotHead, warehouse.worldRobotTorso,
                warehouse.worldRobotHand, warehouse.worldRobotFeet);
        int countOfRobotsInWednesdayGroup = warehouse.countOfRobots(warehouse.wednesdayRobotHead, warehouse.wednesdayRobotTorso,
                warehouse.wednesdayRobotHand, warehouse.wednesdayRobotFeet);
        if (countOfRobotsInWorldGroup > countOfRobotsInWednesdayGroup) {
            System.out.println("In this war win World!");
        } else if (countOfRobotsInWorldGroup < countOfRobotsInWednesdayGroup) {
            System.out.println("In this war win Wednesday!");
        } else {
            System.out.println("In this war not winners!");
        }
    }
}
