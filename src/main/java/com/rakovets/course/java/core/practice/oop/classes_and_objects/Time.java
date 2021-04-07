package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    int secondsInMinute = 60;
    int secondsInHour = 3600;


    public Time (int totalSeconds) {
        this.hours = totalSeconds / secondsInHour;
        this.minutes = totalSeconds / secondsInMinute % secondsInMinute;
        this.seconds = totalSeconds % secondsInMinute;
    }

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public  int getMinutes() {
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
    public int getTotalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }
}
