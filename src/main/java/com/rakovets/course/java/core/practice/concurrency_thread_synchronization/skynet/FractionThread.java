package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.logging.Logger;

public class FractionThread extends Fraction implements Runnable {
    private final Logger logger = Logger.getLogger(FractionThread.class.getName());
    private DeadlineTimer timer;
    private final Factory factory;

    public FractionThread(String fractionName, Factory factory, DeadlineTimer timer) {
        super(fractionName);
        this.factory = factory;
        this.timer = timer;
    }


    public void run() {
        while (timer.isGameRunning()) {
            if (timer.getTimeOfDay().equals("night")) {
                obtainDetails(factory);
            }
        }
        createRobots();
    }
}
