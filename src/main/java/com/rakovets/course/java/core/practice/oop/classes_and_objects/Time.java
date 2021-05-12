package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        seconds = totalSeconds % 60;
        minutes = (totalSeconds - seconds) % 60;
        hours = (totalSeconds - seconds - minutes) / 60;

    }

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int  getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int  getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int hours) {
        this.minutes = hours;
    }

    public int  getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int hours) {
        this.seconds = hours;
    }

    public int getTotalSeconds() {
        return ((hours*60 + minutes)*60)+seconds;
    }

}
