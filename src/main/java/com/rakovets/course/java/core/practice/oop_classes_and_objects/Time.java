package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    private int totalSeconds;

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time (int totalSeconds) {
        this.totalSeconds = totalSeconds;
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

    public int getTotalSeconds() {
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        this.totalSeconds = this.hours * SECONDS_IN_HOUR + this.minutes * SECONDS_IN_MINUTE + this.seconds;
        return this.totalSeconds;
    }

}
