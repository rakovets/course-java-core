package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTES = 60;


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(double totalSeconds) {
        this.hours = (int) (totalSeconds / SECONDS_IN_HOUR);
        this.minutes = (int) (totalSeconds - this.hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTES;
        this.seconds = (int) totalSeconds - (this.hours * SECONDS_IN_HOUR + this.minutes * SECONDS_IN_MINUTES);
    }

    public int getTotalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTES + hours * SECONDS_IN_HOUR;
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
