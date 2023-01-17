package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int secondsInHours = 3600;
    final int secondsInMinutes = 60;

    public Time(int totalSecond) {
        this.hours = totalSecond / secondsInHours;
        this.minutes = totalSecond % secondsInHours / secondsInMinutes;
        this.seconds = totalSecond % secondsInMinutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSecond() {
        int TotalSecond = hours * secondsInHours + minutes * secondsInMinutes + seconds;
        return TotalSecond;
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
}
