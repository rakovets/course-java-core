package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int minutes, int seconds) {
        int totalSeconds = countTotalSeconds(hours, minutes, seconds);
        int[] timesFromTotalSeconds = getTimesFromTotalSeconds(totalSeconds);
        this.hours = timesFromTotalSeconds[0];
        this.minutes = timesFromTotalSeconds[1];
        this.seconds = timesFromTotalSeconds[2];
    }

    Time(int totalSeconds) {
        int[] timesFromTotalSeconds = getTimesFromTotalSeconds(totalSeconds);
        this.hours = timesFromTotalSeconds[0];
        this.minutes = timesFromTotalSeconds[1];
        this.seconds = timesFromTotalSeconds[2];
    }

    private int[] getTimesFromTotalSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        int[] timesFromTotalSeconds = {hours, minutes, seconds};
        return timesFromTotalSeconds;
    }

    private int countTotalSeconds(int hours, int minutes, int seconds) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        return totalSeconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            int totalSeconds = countTotalSeconds(0, minutes, 0);
            int[] timesFromTotalSeconds = getTimesFromTotalSeconds(totalSeconds);
            this.hours = timesFromTotalSeconds[0];
            this.minutes = timesFromTotalSeconds[1];
        } else {
            this.minutes = minutes;
        }

    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 60) {
            int[] timesFromTotalSeconds = getTimesFromTotalSeconds(seconds);
            this.hours = timesFromTotalSeconds[0];
            this.minutes = timesFromTotalSeconds[1];
            this.seconds = timesFromTotalSeconds[2];
        } else
            this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return countTotalSeconds(this.hours, this.minutes, this.seconds);
    }
}










