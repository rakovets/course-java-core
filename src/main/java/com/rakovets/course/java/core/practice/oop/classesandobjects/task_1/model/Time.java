package com.rakovets.course.java.core.practice.oop.classesandobjects.task_1.model;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.print("\nInvalid value of Hours\n\r");
        }
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.print("\nInvalid value of Minutes\n\r");
        }
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            System.out.print("\nInvalid value of Seconds\n\r");
        }
    }
    public Time(int totalseconds) {
        this.seconds = totalseconds;
    }

    public void getHours() {
        this.hours = this.seconds / 3600;
        System.out.printf("\nHours - %d", this.hours);
    }
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.print("Invalid value");
        }
    }
    public void getMinutes() {
        this.minutes = (this.seconds % 3600) / 60;
        System.out.printf("\nMinutes - %d", this.minutes);
    }
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.print("Invalid value");
        }
    }
    public void getSeconds() {
        this.seconds = this.seconds - ((this.minutes * 60) + (this.hours * 3600));
        System.out.printf("\nSeconds - %d", this.seconds);
    }
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            System.out.print("Invalid value");
        }
    }
    public void getTotalseconds() {
        this.seconds = (this.hours * 3600) + (this.minutes * 60);
        System.out.printf("\nTotal seconds: %d", this.seconds);
    }
}


