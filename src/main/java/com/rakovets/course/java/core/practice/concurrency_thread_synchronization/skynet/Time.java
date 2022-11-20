package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.logging.Logger;

public class Time {
    private final Logger logger = Logger.getLogger(Time.class.getName());
    private final int timesOfDay;

    public Time(int timesOfDay) {
        this.timesOfDay = timesOfDay;
    }

    public boolean getAnswerAboutTimeOfDay(String timesOfDay) {
        return timesOfDay.equals("Day");
    }

}
