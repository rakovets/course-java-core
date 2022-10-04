package com.rakovets.course.java.core.practice.oop_principles;

public class Time {
    final int numOfsecInHour = 3600;
    final int numOfSecInMin = 60;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / numOfsecInHour;
        this.minutes = totalSeconds % numOfsecInHour/numOfSecInMin;
        this.seconds = totalSeconds % numOfSecInMin;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    static int getTotalSeconds(int hours, int minutes, int seconds) {
        int totalSeconds = 0;
        final int numOfsecOrMinPerMinOrHour = 60;
        if (seconds >= numOfsecOrMinPerMinOrHour) {
            totalSeconds = numOfsecOrMinPerMinOrHour * (hours * numOfsecOrMinPerMinOrHour + minutes) + seconds;
        } return totalSeconds;
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



