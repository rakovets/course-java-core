package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.logging.Logger;

public class SkyNet {
    private static final Logger logger = Logger.getLogger(SkyNet.class.getName());

    public void countDaysBeforeSkyNet(Producer producer, Timer timer, World world, int days) {
        for (int i = 1; i <= days; i++) {
            Thread producerThread = new Thread(producer, "Producer");
            producerThread.start();
            try {
                producerThread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            Thread worldThread = new Thread(world, "World");
            Thread timerSkyNetThread = new Thread("DaysBeforeSkyNet");
            worldThread.start();
            timerSkyNetThread.start();

            try {
                worldThread.join();
                timerSkyNetThread.join();
            } catch (InterruptedException exception) {
                logger.info(exception.getMessage());
            }
        }
    }

    public String getBestArmy(World world, Timer timer) {
        return (world.getCountOfRobots(world.getStorage()) > timer
                .getCountOfRobots(timer.getStorage())) ? "World" : "Timer";
    }
}
