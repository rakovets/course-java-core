package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int totalSeconds) {
        final int NUMBER_OF_SECONDS_IN_HOUR = 3600;
        final int NUMBER_OF_SECONDS_IN_MINUTE = 60;
        this.hours = totalSeconds / NUMBER_OF_SECONDS_IN_HOUR;
        this.minutes = totalSeconds % NUMBER_OF_SECONDS_IN_HOUR / NUMBER_OF_SECONDS_IN_MINUTE;
        this.seconds = totalSeconds % NUMBER_OF_SECONDS_IN_MINUTE;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
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
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getTotalSeconds() {
        int totalSeconds;
        final int NUMBER_OF_SECONDS_IN_HOUR = 3600;
        final int NUMBER_OF_SECONDS_IN_MINUTE = 60;
        return totalSeconds = hours * NUMBER_OF_SECONDS_IN_HOUR + minutes * NUMBER_OF_SECONDS_IN_MINUTE + seconds;
    }
}
