package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.logging.Logger;

public class World extends Fraction implements Runnable {
    private final Logger logger = Logger.getLogger(World.class.getName());

    public World(Factory factory) {
        super(factory);
    }

    public void run() {
        while (getFactory().getDaysTerm() > 0) {
            obtainDetails();
            createRobot();
        }
        logger.info("World has " + getRobotsAry() + " robots.");
    }
}
