package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSecond) {
        this.hours = totalSecond;
    }

    public Time(int hour, int minutes, int seconds) {
        this.hours = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hour) {
        this.hours = hour;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds() {
        int totalSeconds = this.seconds + (this.minutes * 60) + (this.hours * 3600);
        return totalSeconds;
    }
}
