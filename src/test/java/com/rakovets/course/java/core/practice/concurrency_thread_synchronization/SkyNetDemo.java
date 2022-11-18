package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class SkyNetDemo {
    public static void main(String[] args) {
        Logger logger =  Logger.getLogger(SkyNetDemo.class.getName());

        Timer timer = new Timer(2);
        Factory factory = new Factory(timer, 10);
        FactoryThread factoryThread = new FactoryThread(factory, timer);
        FractionThread world = new FractionThread("World", factory, timer);
        FractionThread wednesday = new FractionThread("Wednesday", factory, timer);
        Thread factoryActive = new Thread(factoryThread);
        Thread worldActive = new Thread(world);
        Thread wednesdayActive = new Thread(wednesday);

        factoryActive.start();
        worldActive.start();
        wednesdayActive.start();

        try {
            factoryActive.join();
            worldActive.join();
            wednesdayActive.join();
        } catch (InterruptedException e) {
            logger.warning("StackTrace" + Arrays.toString(e.getStackTrace()));
        }

        if (world.getRobotsAmount() > wednesday.getRobotsAmount()) {
            logger.info("World won");
        } else {
            logger.info("Wednesday won");
        }
    }
}
