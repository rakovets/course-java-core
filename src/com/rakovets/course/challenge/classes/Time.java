package com.rakovets.course.challenge.classes;

public class Time {
    int hours ;
    int minutes;
    int seconds;
    Time(int totalSeconds) {
        this.seconds = totalSeconds % 60;
        this.minutes = totalSeconds / 60 % 60;
        this.hours = totalSeconds /60 / 60;
    }
    Time(int hours, int minutes, int seconds) {
        this.seconds =seconds;
        this.minutes = minutes;
        this.hours =hours;
    }
    int getHours(){
        return this.hours;
    }
    void setHours(int hours){
        this.hours = hours;
    }
    int getMinutes(){
        return this.minutes;
    }
    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    int getSeconds(){
        return this.seconds;
    }
    void setSeconds(int seconds){
        this.seconds = seconds;
    }
    int getTotalSeconds(){
        return this.seconds + this.minutes*60 + this.hours*60;
    }

}
