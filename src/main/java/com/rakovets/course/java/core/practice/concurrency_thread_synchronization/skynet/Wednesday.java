package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.logging.Logger;

public class Wednesday extends Fraction implements Runnable {
    private final Logger logger = Logger.getLogger(Wednesday.class.getName());

    public Wednesday(Factory factory) {
        super(factory);
    }

    public void run() {
        while (getFactory().getDaysTerm() > 0) {
            obtainDetails();
            createRobot();
        }
        logger.info("Wednesday has " + getRobotsAry() + " robots.");
    }
}
