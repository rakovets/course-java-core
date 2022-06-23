package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.io.IOException;

public class Time {
    private static final int SECONDS_IN_MINUTE = 60;

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) throws IllegalArgumentException {
        if (totalSeconds < 0) {
            throw new IllegalArgumentException();
        } else {
            this.hours = (int) (totalSeconds / Math.pow(SECONDS_IN_MINUTE, 2));
            this.minutes = totalSeconds / SECONDS_IN_MINUTE % SECONDS_IN_MINUTE;
            this.seconds = totalSeconds % SECONDS_IN_MINUTE;
        }
    }

    public Time(int hours, int minutes, int seconds) throws IllegalArgumentException {
        if (minutes > 59 || seconds > 59 || minutes < 0 || seconds < 0 || hours < 0) {
            throw new IllegalArgumentException();
        } else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public int getTotalSeconds() {
        double totalSeconds = getHours() * Math.pow(SECONDS_IN_MINUTE, 2);
        totalSeconds += getMinutes() * SECONDS_IN_MINUTE;
        totalSeconds += getSeconds();
        return (int) totalSeconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
