package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.concurrent.TimeUnit;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time (int totalSeconds) {
        initHoursMinutesSeconds(totalSeconds);
    }

    Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return parseHoursMinutesSecondsToSeconds();
    }

    private void initHoursMinutesSeconds(int totalSeconds) {
        this.hours = (int) TimeUnit.SECONDS.toHours(totalSeconds);
        this.minutes = (int) (TimeUnit.SECONDS.toMinutes(totalSeconds) - TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(totalSeconds)));
        this.seconds = (int) (TimeUnit.SECONDS.toSeconds(totalSeconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(totalSeconds)));
    }

    private int parseHoursMinutesSecondsToSeconds() {
        return (int) (seconds + TimeUnit.MINUTES.toSeconds(minutes) + TimeUnit.HOURS.toSeconds(hours));
    }
}
