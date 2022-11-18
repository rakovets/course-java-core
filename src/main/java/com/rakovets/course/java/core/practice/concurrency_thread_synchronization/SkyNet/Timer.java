package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.logging.Logger;

public class Timer {
    private final Logger logger = Logger.getLogger(Timer.class.getName());
    private final int days;
    private boolean isActive;
    private String timeOfDay;
    private double counter;

    public Timer(int days) {
        this.days = days;
        timeOfDay = "day";
        isActive = true;
        counter = 0;
    }

    public void changeTime() {
        timeOfDay = timeOfDay.equals("day") ? "night" : "day";
        double HALF_OF_DAY = 0.5;
        counter += HALF_OF_DAY;
        if (counter > days) {
            isActive = false;
            logger.info("Game over");
        }
        logger.info(timeOfDay + "has begun");
    }

    public boolean isActive() {
        return isActive;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
}
