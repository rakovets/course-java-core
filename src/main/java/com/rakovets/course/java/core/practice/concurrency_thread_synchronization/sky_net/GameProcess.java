package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class GameProcess {
    private final double halfDay = 0.5;
    private final int dayLimit;
    private volatile String timesOfDay = "day";
    private double daysCounter = 0;
    private volatile boolean isGameRunning = true;

    public GameProcess(int dayLimit) {
        this.dayLimit = dayLimit;
    }

    public void changeTimesOfDay() {
        timesOfDay = timesOfDay.equals("day") ? "night" : "day";
        System.out.println("Now it's " + timesOfDay);
        daysCounter += halfDay;
        if (daysCounter > dayLimit) {
            isGameRunning = false;
            System.out.println("Game stopped!");
        }
    }

    public String getTimesOfDay() {
        return timesOfDay;
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }
}
