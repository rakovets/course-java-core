package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private static int hours;
    private static int minutes;
    private static int seconds;

    Time(int totalSeconds) {
        hours = totalSeconds / 3600;
        minutes = totalSeconds % 3600 / 60;
        seconds = totalSeconds % 3600 % 60 ;
    }

    Time(int hours, int minutes, int seconds) {
            Time.hours = hours;
            Time.minutes = minutes;
            Time.seconds = seconds;
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

    public void setHours(int hours) {
        Time.hours = hours;
    }

    public void setMinutes(int minutes) {
        Time.minutes = minutes;
    }

    public static void setSeconds(int seconds) {
        Time.seconds = seconds;
    }

    public static int getTotalSeconds() {
        return (hours * 3600 + minutes * 60 + seconds);
    }
}
