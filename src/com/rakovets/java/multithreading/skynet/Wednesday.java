package com.rakovets.java.multithreading.skynet;

public class Wednesday implements Runnable {
    Warehouse warehouse;

    Wednesday(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.wednesdayGetDetails();
        System.out.printf("On %d day wednesday get details: %d - head, %d - torso, %d - hand, %d - feet\n",
                warehouse.countOfDays, warehouse.wednesdayRobotHead, warehouse.wednesdayRobotTorso, warehouse.wednesdayRobotHand,
                warehouse.wednesdayRobotFeet);
    }
}
