package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class GameProcess implements Runnable {
    private String timesOfDay = "day";
    private final int dayLimit;
    private int daysCounter = 0;
    private final int dayLength;

    public GameProcess(int dayLimit, int dayLength) {
        this.dayLimit = dayLimit;
        this.dayLength = dayLength;
    }

    private void changeTimesOfDay() {
        timesOfDay = timesOfDay.equals("day") ? "night" : "day";
        System.out.println("Now it's " + timesOfDay);
    }

    @Override
    public void run() {
        while (daysCounter < dayLimit) {
            try {
                Thread.sleep(dayLength);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            changeTimesOfDay();
            ++daysCounter;
            System.out.println("It's day number " + daysCounter);
        }
    }

    public String getTimesOfDay() {
        return timesOfDay;
    }
}
