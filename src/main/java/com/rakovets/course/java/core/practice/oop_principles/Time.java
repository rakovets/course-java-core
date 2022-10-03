package com.rakovets.course.java.core.practice.oop_principles;

public class Time {

    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSeconds) {
        totalSeconds = getTotalSeconds(hours, minutes, seconds);
    }

    static int getTotalSeconds(int hours, int minutes, int seconds) {
        int totalSeconds = 0;
        final int numOfMinOrSecPerHourOrMin = 60;
        totalSeconds = numOfMinOrSecPerHourOrMin * (hours * numOfMinOrSecPerHourOrMin + minutes) + seconds;
        return totalSeconds;
    }

    public Time(int hours, int minutes, int seconds) {
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
}



