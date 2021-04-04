package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private final int SECOND_PER_HOUR = 3_600;
    private final int SECONDS_PER_MINUTE = 60;


    public Time(int totalSeconds) {

        this.hours = totalSeconds / SECOND_PER_HOUR;
        this.minutes = (totalSeconds - this.hours * SECOND_PER_HOUR) / SECONDS_PER_MINUTE;
        this.seconds = totalSeconds - this.hours * SECOND_PER_HOUR - this.minutes * SECONDS_PER_MINUTE;

        totalSeconds = this.hours + this.minutes + this.seconds;
    }

    public Time(int hours, int minute, int seconds) {
        this.hours = hours;
        this.minutes = minute;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minutes;
    }

    public void setMinute(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return hours * SECOND_PER_HOUR + minutes * SECONDS_PER_MINUTE + seconds;
    }
}

