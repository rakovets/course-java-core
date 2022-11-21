package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Wednesday;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.World;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoProjectSkyNet {
    private static final Integer DAY_OF_HARD_WORK = 5;
    private static final Logger logger = Logger.getLogger(DemoProjectSkyNet.class.getCanonicalName());

    public static void main(String[] args) throws InterruptedException {
        Factory factory = Factory.getInstance();
        Wednesday wednesday = Wednesday.getInstance();
        World world = World.getInstance();

        for (int i = 0; i < DAY_OF_HARD_WORK; i++) {
            Thread factoryThread = new Thread(factory);
            Thread wednesdayThread = new Thread(wednesday);
            Thread worldThread = new Thread(world);
            factoryThread.start();
            factoryThread.join();
            wednesdayThread.start();
            worldThread.start();
            wednesdayThread.join();
            worldThread.join();
            factory.getIsDay().set(true);
        }
        logger.log(Level.INFO, String.valueOf(wednesday.getCacheSize()));
        logger.log(Level.INFO, String.valueOf(world.getCacheSize()));
    }
}
