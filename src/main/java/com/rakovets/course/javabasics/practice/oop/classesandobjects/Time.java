package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int totalSeconds;

    Time(int totalSeconds) {
        this.hours = totalSeconds / (60 * 60);
        this.minutes = totalSeconds / 60 - (hours * 60);
        this.seconds = totalSeconds - (hours * 60 * 60) - (minutes * 60);
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
        int totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
        return totalSeconds;
    }
}
