package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private static final int CONST_SECONDS = 60;

    public Time(int totalSeconds) {
        if (totalSeconds < 0) {
            throw new Error();
        } else {
            this.hours += totalSeconds / Math.pow(CONST_SECONDS, 2);
            this.minutes = totalSeconds / CONST_SECONDS % CONST_SECONDS;
            this.seconds = totalSeconds % CONST_SECONDS;
        }
    }

    public Time(int hours, int minutes, int seconds) {
        if (minutes > 59 || seconds > 59 || minutes < 0 || seconds < 0 || hours < 0) {
            throw new Error();
        } else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
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

    public int getTotalSeconds() {
        double totalSeconds = getHours() * Math.pow(CONST_SECONDS, 2);
        totalSeconds += getMinutes() * CONST_SECONDS;
        totalSeconds += getSeconds();
        return (int) totalSeconds;
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

    private int hours;
    private int minutes;
    private int seconds;
}
