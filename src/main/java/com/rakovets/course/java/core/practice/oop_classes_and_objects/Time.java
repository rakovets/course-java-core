package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int MINUTES_TO_SECONDS = 60;
    final int HOURS_TO_SECONDS = 3600;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalSeconds) {
        this.hours = totalSeconds / HOURS_TO_SECONDS;
        this.minutes = (totalSeconds & HOURS_TO_SECONDS) / MINUTES_TO_SECONDS;
        this.seconds = (totalSeconds & HOURS_TO_SECONDS) % MINUTES_TO_SECONDS;
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
        return seconds + minutes * MINUTES_TO_SECONDS + hours * HOURS_TO_SECONDS;
    }
}
