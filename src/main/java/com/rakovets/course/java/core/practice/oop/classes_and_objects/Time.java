package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    final int SECONDS_IN_MINUTE = 60;
    final int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * 60;
    private int hours;
    private int minutes;
    private int seconds;

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time (int totalSeconds) {
        hours = totalSeconds / SECONDS_IN_HOUR;
        minutes =  (totalSeconds - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        seconds = totalSeconds % SECONDS_IN_MINUTE;
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
        return hours * 3600 + minutes * 60 + seconds;
    }
}
