package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int SECONDS_IN_ONE_HOUR = 3600;
    final int SECONDS_IN_ONE_MINUTE = 60;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_ONE_HOUR;
        this.minutes = (totalSeconds - this.hours * SECONDS_IN_ONE_HOUR) / SECONDS_IN_ONE_MINUTE;
        this.seconds = totalSeconds - (this.hours * SECONDS_IN_ONE_HOUR + this.minutes * SECONDS_IN_ONE_MINUTE);
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours () {
        return hours;
    }
    public void setHours (int hours) {
        this.hours = hours;
    }
    public int getMinutes () {
        return minutes;
    }
    public void setMinutes (int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds () {
        return seconds;
    }
    public void setSeconds (int seconds) {
        this.seconds = seconds;
    }
    public int getTotalSeconds () {
        return seconds+minutes*SECONDS_IN_ONE_MINUTE+hours*SECONDS_IN_ONE_HOUR;
    }
}
