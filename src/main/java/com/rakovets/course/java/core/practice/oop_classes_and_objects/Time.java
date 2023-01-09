package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time (int totalSeconds) {
        if (totalSeconds >= 0) {
            this.hours = totalSeconds / 3600;
            this.minutes = (totalSeconds - hours * 3600) / 60;
            this.seconds = totalSeconds - hours * 3600 - minutes * 60;
        } else {
            System. exit(404);
        }
    }
    Time (int hours, int minutes, int seconds) {
        if (hours >= 0) {
            this.hours = hours;
        } else {
            System. exit(404);
        }
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System. exit(404);
        }
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System. exit(404);
        }
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
