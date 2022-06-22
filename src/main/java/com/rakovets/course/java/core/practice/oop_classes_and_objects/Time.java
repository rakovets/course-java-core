package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minute;
    private int seconds;

    public Time (int hours, int minute, int seconds) {
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconds() {
        return this.seconds;
    }
}
