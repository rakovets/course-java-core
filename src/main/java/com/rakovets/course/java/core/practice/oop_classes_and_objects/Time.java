package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds / 60;
        this.seconds = totalSeconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes + hours * 60;
        this.seconds = seconds + minutes * 60 + hours * 3600;
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

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds(int  hours, int minutes, int seconds) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        return totalSeconds;
    }
}
