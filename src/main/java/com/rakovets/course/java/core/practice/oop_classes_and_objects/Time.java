package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Time(int totalSeconds) {
        int allSeconds = totalSeconds;
        this.hours = allSeconds / 3600;
        allSeconds %= 3600;
        this.minutes = allSeconds / 60;
        allSeconds %= 60;
        this.seconds = allSeconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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
        return (this.hours * 3600) + (this.minutes * 60) + this.seconds;
    }
}
