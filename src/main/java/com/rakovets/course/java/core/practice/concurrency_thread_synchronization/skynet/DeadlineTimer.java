package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.logging.Logger;

public class DeadlineTimer {
    private final Logger logger = Logger.getLogger(DeadlineTimer.class.getName());
    private final int daysTerm;
    private final double HALF_OF_DAY = 0.5;
    private boolean isGameRunning;
    private String timeOfDay;
    private double counter;

    public DeadlineTimer(int daysTerm) {
        this.daysTerm = daysTerm;
        timeOfDay = "day";
        isGameRunning = true;
        counter = 0;
    }

    public void switchTime() {
        timeOfDay = timeOfDay.equals("day") ? "night" : "day";
        counter += HALF_OF_DAY;
        if (counter > daysTerm) {
            isGameRunning = false;
            logger.info("The dame is finished!");
        }
        logger.info("The " + timeOfDay + " has begun");
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
}
