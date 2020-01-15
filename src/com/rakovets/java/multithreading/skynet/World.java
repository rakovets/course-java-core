package com.rakovets.java.multithreading.skynet;

public class World implements Runnable {
    Warehouse warehouse;

    World(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.worldGetDetails();
        System.out.printf("On %d day world get details: %d - head, %d - torso, %d - hand, %d - feet\n",
                warehouse.countOfDays, warehouse.worldRobotHead, warehouse.worldRobotTorso, warehouse.worldRobotHand,
                warehouse.worldRobotFeet);
    }
}
