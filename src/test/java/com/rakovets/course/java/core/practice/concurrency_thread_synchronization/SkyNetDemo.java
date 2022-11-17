package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.*;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SkyNetDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SkyNetDemo.class.getName());
        DeadlineTimer timer = new DeadlineTimer(5);
        Factory factory = new Factory(timer, 10);
        FactoryThread factoryThread = new FactoryThread(factory, timer);
        FractionThread world = new FractionThread("World", factory, timer);
        FractionThread wednesday = new FractionThread("Wednesday", factory, timer);
        Thread factoryRunning = new Thread(factoryThread);
        Thread worldRunning = new Thread(world);
        Thread wednesdayRunning = new Thread(wednesday);
        factoryRunning.start();
        worldRunning.start();
        wednesdayRunning.start();

        try {
            factoryRunning.join();
            worldRunning.join();
            wednesdayRunning.join();
        } catch (InterruptedException e) {
            logger.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }

        if (wednesday.getRobotsAry() > world.getRobotsAry()) {
            logger.log(Level.INFO, "Wednesday army is stronger");
        } else if (wednesday.getRobotsAry() < world.getRobotsAry()) {
            logger.log(Level.INFO, "World army is stronger");
        } else {
            logger.log(Level.INFO, "Draw");
        }
    }
}
