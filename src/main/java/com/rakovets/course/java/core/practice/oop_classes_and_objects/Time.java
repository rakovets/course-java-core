package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private final int secondConvertForHour = 3600;
    private final int secondConvertForMinutes = 60;

    private int hours;
    private int minutes;
    private int seconds;


    public Time(int totalTimeInSeconds) {
        this.hours = totalTimeInSeconds / secondConvertForHour;
        int secondsLeft = totalTimeInSeconds % secondConvertForHour;
        this.minutes = secondsLeft / secondConvertForMinutes;
        secondsLeft = secondsLeft % secondConvertForMinutes;
        this.seconds = secondsLeft;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
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

    public int totalTimeInSeconds() {
        return this.seconds + (this.minutes * secondConvertForMinutes) + (this.hours * secondConvertForHour);
    }
}




