package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time (int totalSeconds) {
        hours *= 60 * 60;
        minutes *= 60;
        seconds += hours + minutes;
    }
    public Time (int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
    }
    public int getHours() {
        return hours;
    }
    public int setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public int setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
