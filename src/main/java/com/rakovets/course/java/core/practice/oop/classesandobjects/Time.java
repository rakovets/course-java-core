package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time (int totalSeconds) {
    }

    public Time (int hours, int minutes, int seconds) {
            int hour = seconds / 3600,
                minute = seconds / 60 % 60,
                sec = seconds / 1 % 60;
        return ;
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
        return seconds;
    }
}

