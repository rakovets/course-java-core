package com.rakovets.course.java.core.practice.oop.classesandobjects.task_1.model;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalseconds) {
        this.seconds = totalseconds;
    }

    public int getHours() {
        this.hours = this.seconds / 3600;
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        this.minutes = (this.seconds % 3600) / 60;
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        this.seconds = this.seconds - ((this.minutes * 60) + (this.hours * 3600));
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void getTotalseconds() {
        this.seconds += (this.hours * 3600) + (this.minutes * 60);
        System.out.printf("Total seconds: %d", this.seconds);
    }
    public  void getHHMMSS() {
        System.out.printf("%d:%d:%d", getHours(), getMinutes(), getSeconds());
    }
}


