package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int  minutes;
    private int seconds;

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("This hours: " + hours);
    }

    public Time (int totalSeconds) {
        getTotalSeconds(totalSeconds);
    }

    public int getHours () {

        return this.hours;
    }
    public void setHours (int hours) {
        this.hours = hours;
    }
    public  int getMinutes () {
        return this.minutes;
    }
    public void setMinutes () {
        this.minutes = minutes;
    }

    public  int getSeconds () {
        return this.seconds;
    }

    public void setSeconds () {
        this.seconds = seconds;
    }

    public void getTotalSeconds (int totalSeconds) {
        System.out.println ("This total seconds: " + totalSeconds);
    }


}

