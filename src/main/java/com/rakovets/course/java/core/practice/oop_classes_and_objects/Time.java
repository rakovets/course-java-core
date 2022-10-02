package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    Time() {
    }

    Time(int totalSeconds) {
        final int secondsInMin = 60;
        final int secondsInHour = 3600;
        final int secondsInDay = 86400;
        this.hours = totalSeconds % secondsInDay / secondsInHour;
        this.minutes = totalSeconds % secondsInHour / secondsInMin;
        this.seconds = totalSeconds % secondsInMin;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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
        final int secondsInMin = 60;
        final int secondsInHour = 3600;
        return hours * secondsInHour + minutes * secondsInMin + seconds;
    }
}
