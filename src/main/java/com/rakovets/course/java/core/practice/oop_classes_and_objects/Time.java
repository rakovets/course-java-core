package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        int SECONDS_IN_HOUR = 3600;
        int SECONDS_IN_MINUTE = 60;
        int allSeconds = totalSeconds;

        this.hours = allSeconds / SECONDS_IN_HOUR;
        allSeconds %= SECONDS_IN_HOUR;
        this.minutes = allSeconds / SECONDS_IN_MINUTE;
        allSeconds %= SECONDS_IN_MINUTE;
        this.seconds = allSeconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return (this.hours * 3600) + (this.minutes * 60) + this.seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
