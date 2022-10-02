package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    public static void main(String[] args) {

    }
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int totalSeconds) {
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        this.hours = totalSeconds / secondsInHour;
        this.minutes = totalSeconds % secondsInHour / secondsInMinute;
        this.seconds = totalSeconds % secondsInMinute;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public int getTotalSeconds(int hours, int minutes, int seconds) {
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        int totalSeconds = hours * secondsInHour + minutes * secondsInMinute + seconds;
        return totalSeconds;
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
}
