package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Fraction;

import java.util.logging.Logger;

public class SkyNetDemo {
    public static final Logger logger = Logger.getLogger(SkyNetDemo.class.getName());

    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(2);
        factory.setName("Factory");
        Fraction world = new Fraction(factory);
        world.setName("World");
        Fraction wednesday = new Fraction(factory);
        wednesday.setName("Wednesday");
        factory.start();
        world.start();
        wednesday.start();
        factory.join();
        world.join();
        wednesday.join();
        logger.info(compareFactions(wednesday, world));
    }

    private static String compareFactions(Fraction faction1, Fraction faction2) {
        if (faction1.makeRobots() > faction2.makeRobots()) {
            return faction1.getName() + " is a winner";
        } else {
            return faction2.getName() + " is a winner";
        }
    }
}
