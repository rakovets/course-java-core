package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private final int SECONDS_IN_A_MINUTE = 60;
    private final int MINUTES_IN_A_HOUR = 60;

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / (MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE);
        this.minutes = (totalSeconds / SECONDS_IN_A_MINUTE) % MINUTES_IN_A_HOUR;
        this.seconds = totalSeconds % SECONDS_IN_A_MINUTE;
    }

    public Time(int hours, int minutes, int seconds) {
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
        return (hours * MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE) + (minutes * SECONDS_IN_A_MINUTE) + seconds;
    }
}
