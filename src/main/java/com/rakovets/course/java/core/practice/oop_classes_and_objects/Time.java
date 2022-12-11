package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    public final static int CONSTANT = 60;
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSeconds) {
        this.seconds = totalSeconds % CONSTANT;
        totalSeconds /= CONSTANT;
        this.minutes = totalSeconds % CONSTANT;
        this.hours = totalSeconds / CONSTANT;
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getTotalSeconds() {
        return (hours * CONSTANT + minutes) * CONSTANT + seconds;
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

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes % CONSTANT;
        this.hours += minutes / CONSTANT;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds % CONSTANT;
        seconds /= CONSTANT;
        this.minutes += seconds % CONSTANT;
        this.hours += seconds / CONSTANT;
    }
}
