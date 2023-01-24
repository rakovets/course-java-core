package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.concurrent.TimeUnit;

public class Time {
    private long hours;
    private long minutes;
    private long seconds;

    public Time (int totalSeconds) {
        initHoursMinutesSeconds(totalSeconds);
    }

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void initHoursMinutesSeconds(int totalSeconds) {
        hours = TimeUnit.SECONDS.toHours(totalSeconds);
        minutes = TimeUnit.SECONDS.toMinutes(totalSeconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds = totalSeconds - TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(minutes);
    }

    public long getTotalSeconds() {
        return parseHoursMinutesSecondsToSeconds();
    }

    private long parseHoursMinutesSecondsToSeconds() {
        return seconds + TimeUnit.MINUTES.toSeconds(minutes) + TimeUnit.HOURS.toSeconds(hours);
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }
}
