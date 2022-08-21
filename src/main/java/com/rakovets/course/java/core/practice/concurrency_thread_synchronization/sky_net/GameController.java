package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class GameController {
    private final double halfDay = 0.5;
    private final int dayLimit;
    private volatile boolean isGameRunning = true;
    private volatile String timesOfDay = "day";
    public double daysCounter = 0;

    public GameController(int dayLimit) {
        this.dayLimit = dayLimit;
    }

    public void changeTimesOfDay() {
        timesOfDay = timesOfDay.equals("day") ? "night" : "day";
        daysCounter += halfDay;
        if (daysCounter > dayLimit) {
            isGameRunning = false;
            System.out.println("Game finished!");
        }
    }

    public String getTimesOfDay() {
        return timesOfDay;
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }
}
