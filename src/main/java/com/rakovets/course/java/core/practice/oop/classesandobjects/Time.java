package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        if (0 < totalSeconds) {
            this.hours = totalSeconds / 3600;
            this.minutes = totalSeconds % 3600 / 60;
            this.seconds = totalSeconds % 60;
        }
    }
    public Time(int hours, int minutes, int seconds) {
        if (0 < hours) {
            this.hours = hours;
        }
        if (0 < minutes && minutes < 60) {
            this.minutes = minutes;
        }
        if (0 < seconds && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return this.hours;
    }
    public void setHours(int hours) {
        if (0 <= hours) {
            this.hours = hours;
        }
    }
    public int getMinutes() {
        return this.minutes;
    }
    public void setMinutes(int minutes) {
        if (0 <= minutes && minutes < 60) {
            this.minutes = minutes;
        }
    }
    public int getSeconds() {
        return this.seconds;
    }
    public void setSeconds(int seconds) {
        if (0 <= seconds && seconds < 60) {
            this.seconds = seconds;
        }
    }
    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }
}
