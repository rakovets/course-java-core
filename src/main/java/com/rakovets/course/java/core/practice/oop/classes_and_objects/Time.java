package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int totalSeconds) {
       this.hours =  hours / 3600;
       this.minutes = (hours % 3600) / 60;
       this.seconds = (hours % 3600) % 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
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
}

