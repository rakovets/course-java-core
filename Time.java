package com.rakovets.course.challenge.oopClassesAndObjects;

public class Time {
    private int hour;
    private int min;
    private int sec;

    Time(int seconds) {
        this.hour = seconds / 3600;
        this.min = seconds % 60;
        this.sec = (seconds % 60) % 60;
    }
    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    int getHour() {
        return this.hour;
    }
    int getMin() {
        return this.min;
    }
    int getSec() {
        return  this.sec;
    }

    int getSeconds() {
        return hour * 3600 + min * 60 + sec;
    }

    void display() {
        System.out.printf("hour: %d, min: %d, sec: %d\n", this.hour, this.min, this.sec);
    }
}
