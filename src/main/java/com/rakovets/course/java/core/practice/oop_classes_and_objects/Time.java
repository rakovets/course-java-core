package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private final int SECONDS_IN_A_MINUTE = 60;
    private final int SECONDS_IN_A_HOUR = 3600;

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
        int secondsInHours = getHours() * 3600;
        int secondsInMinutes = getMinutes() * 60;
        int totalSeconds = secondsInHours + secondsInMinutes + getSeconds();
        return totalSeconds;
    }

    Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time (int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_A_HOUR;
        this.minutes = totalSeconds / SECONDS_IN_A_MINUTE % SECONDS_IN_A_MINUTE;
        this.seconds = totalSeconds % SECONDS_IN_A_MINUTE;
    }
}
