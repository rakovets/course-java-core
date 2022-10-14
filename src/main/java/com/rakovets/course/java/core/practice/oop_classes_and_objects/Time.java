package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int SECONDS_IN_MINUTE = 60;
    final int SECONDS_IN_HOUR = 3600;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_HOUR;
        this.minutes = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        this.seconds = (totalSeconds % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE;
    }

    public Time(int h, int min, int sec) {
        this.hours = h;
        this.minutes = min + h * SECONDS_IN_MINUTE;
        this.seconds = sec + min * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR ;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int min) {
        this.minutes = min;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int sec) {
        this.seconds = sec;
    }

    public int getTotalSeconds() {
        return this.hours * SECONDS_IN_HOUR + this.minutes * SECONDS_IN_MINUTE + this.seconds;
    }
}



