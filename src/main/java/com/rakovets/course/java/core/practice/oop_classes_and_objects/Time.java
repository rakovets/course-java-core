package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {

    private int hours = 10;
    private int minutes = 20;
    private int seconds = 30;
    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTES = 60;


    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_HOUR;
        totalSeconds %= SECONDS_IN_HOUR;
        this.minutes = totalSeconds / SECONDS_IN_MINUTES;
        this.seconds = totalSeconds % SECONDS_IN_MINUTES;
    }

    public int getHours() {
        return this.hours;
    }

    public int setHours(int hours) {
        return hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int setMinutes(int minutes) {
        return minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int setSeconds(int seconds) {
        return seconds;
    }

    public int getTotalSeconds() {
        final int MINUTES_IN_SECONDS = 60;
        int minutesInSeconds = this.minutes * MINUTES_IN_SECONDS;
        int hoursInSeconds = this.hours * MINUTES_IN_SECONDS * MINUTES_IN_SECONDS;
        int totalSeconds = hoursInSeconds + minutesInSeconds + this.seconds;
        return  totalSeconds;
    }
}
