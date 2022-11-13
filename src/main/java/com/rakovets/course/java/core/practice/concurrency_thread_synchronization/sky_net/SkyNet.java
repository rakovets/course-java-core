package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class SkyNet {

    public void dayInSkyNet(Producer producer, Wednesday wednesday, World world, int days) {
        for (int i = 1; i <= days; i++) {
            Thread producerThread = new Thread(producer, "Producer");
            producerThread.start();
            try {
                producerThread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            Thread worldThread = new Thread(world, "World");
            Thread wednesdayThread = new Thread(wednesday, "Wednesday");
            worldThread.start();
            wednesdayThread.start();
            try {
                worldThread.join();
                wednesdayThread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getStrongerArmy(World world, Wednesday wednesday) {
        return (world.getCountOfRobots(world.getStock()) > wednesday.getCountOfRobots(wednesday.getStock())) ? "World" : "Wednesday";
    }
}
