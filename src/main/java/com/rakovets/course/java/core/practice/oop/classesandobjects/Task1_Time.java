package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class Task1_Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time( int allSeconds) {
        this.hours = allSeconds /3600;
        this.minutes =allSeconds % 3600 / 60;
        this.seconds = allSeconds;
    }
    public Time (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes =minutes;
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
public int getallseconds() {
    int allSeconds = this.hours *3600 + this.minutes * 60 + this.seconds;
    return allSeconds;
    }
}




