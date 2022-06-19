package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    public static final int SEC_IN_HOUR = 3600;
    public static final int SEC_IN_MIN = 60;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalSeconds) {
        this.hours = totalSeconds / SEC_IN_HOUR;
        this.minutes = (totalSeconds % SEC_IN_HOUR) / SEC_IN_MIN;
        this.seconds = (totalSeconds % SEC_IN_HOUR) % SEC_IN_MIN;
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
        return hours * SEC_IN_HOUR + minutes * SEC_IN_MIN + seconds;
    }
}
