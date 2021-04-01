package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        hours = totalSeconds / 3600;
        minutes = totalSeconds / 60 % 60;
        seconds = totalSeconds % 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int setHours(int hours) {
        return this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int setMinutes(int minutes) {
        return this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int setSeconds(int seconds) {
        return this.seconds = seconds;
    }

}
