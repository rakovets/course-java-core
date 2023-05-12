package com.rakovets.course.java.core.practice.oop_principles.Task01;

public class Time {
    public static void main(String[] args) {
        Time clock = new Time(63456);
        System.out.println("часы: " +clock.getHours()+", минуты: " + clock.getMinutes()+", секунды:" + clock.getSeconds());
        Time clock1 = new Time(534,435,6547);
        System.out.println("часы: " +clock1.getHours()+", минуты: " + clock1.getMinutes()+", секунды:" + clock1.getSeconds());

    }
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    int getHours() { return hours; }
    void setHours(int hours){
        this.hours = hours;
    }
    int getMinutes() {
        return minutes;
    }
    void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    int getSeconds() {
        return seconds;
    }

//    static void getTotalSeconds() {
//        return totalSeconds;
//    }
}
