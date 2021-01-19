package com.rakovets.course.java.core.example.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public  Time(int hours, int minutes, int seconds) {
        if (hours > 0) {
            this.hours = hours;
        }
        if (minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        }
        if (seconds > 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }
    public  Time(int totalSeconds) {
        if (0 < totalSeconds) {
            this.hours = totalSeconds / 3600;
            this.minutes = totalSeconds % 3600 / 60;
            this.seconds = totalSeconds % 60;
        }
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

    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

}
