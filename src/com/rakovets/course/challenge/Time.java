package com.rakovets.course.challenge;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int totalTime;

    Time(int totalSeconds){
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % (60 * 60)) / 60;
        this.seconds = (totalSeconds % 60) % 60;
    }

    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void getHours(){
        System.out.println("Hours are " + this.hours);
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public void getMinutes(){
        System.out.println("Minutes are " + this.minutes);
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void getSeconds() {
        System.out.println("Seconds are " + this.seconds);
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void getTotalSeconds(){
        this.totalTime = this.seconds + (this.minutes * 60) + (this.hours * 60 * 60);
        System.out.println("Total seconds are " + this.totalTime);
    }
}
