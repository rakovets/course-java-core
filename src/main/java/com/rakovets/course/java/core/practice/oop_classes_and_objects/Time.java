package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSeconds) {
        this.seconds = totalSeconds % 60;
        totalSeconds /= 60;
        this.minutes = totalSeconds % 60;
        this.hours = totalSeconds / 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getTotalSeconds() {
        return (hours * 60 + minutes) * 60 + seconds;
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

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes % 60;
        this.hours += minutes / 60;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds % 60;
        seconds /= 60;
        this.minutes += seconds % 60;
        this.hours += seconds / 60;
    }
}
