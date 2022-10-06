package com.rakovets.course.java.core.practice.oop_classes_and_objects;


public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    final int secondsHour = 3600;
    final int minutesHour = 60;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / secondsHour;
        this.minutes = (totalSeconds % secondsHour) / minutesHour;
        this.seconds = (totalSeconds % secondsHour) % minutesHour;
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return this.hours * secondsHour + this.minutes * minutesHour + this.seconds;
    }
}
