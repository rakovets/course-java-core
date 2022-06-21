package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time(int totalSeconds) {
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        this.hours = (totalSeconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)) % HOURS_IN_DAY;;
        this.minutes = (totalSeconds / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR ;
        this.seconds = totalSeconds % SECONDS_IN_MINUTE;
    }
    public int getTotalSeconds() {
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        return (this.hours * SECONDS_IN_MINUTE * SECONDS_IN_MINUTE) + (this.minutes * MINUTES_IN_HOUR) + this.seconds;
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
}
