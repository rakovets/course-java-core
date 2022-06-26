package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minute;
    private int seconds;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;

    public Time(int hours, int minute, int seconds) {
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return this.hours * SECONDS_IN_HOUR + this.minute * SECONDS_IN_MINUTE + this.seconds;
    }

    public Time(int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_HOUR;
        this.minute = totalSeconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTE;
        this.seconds = totalSeconds % SECONDS_IN_HOUR % SECONDS_IN_MINUTE;
    }
}
