package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        System.out.println("Constructor");
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
