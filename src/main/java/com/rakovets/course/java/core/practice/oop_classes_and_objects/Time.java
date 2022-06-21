package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    final int SECONDS_TO_HOUR = 3600;
    final int SECONDS_TO_MINUTE = 60;

    /**
     * Constructor. Converts the total time in seconds to hours, minutes and seconds respectively.
     *
     * @param totalSeconds total time in seconds.
     */
    public Time(long totalSeconds) {
        this.hours = (int) totalSeconds / SECONDS_TO_HOUR;
        this.minutes = (int) (totalSeconds - this.hours * SECONDS_TO_HOUR) / SECONDS_TO_MINUTE;
        this.seconds = (int) totalSeconds - (this.hours * SECONDS_TO_HOUR + this.minutes * SECONDS_TO_MINUTE);
    }

    /**
     * Constructor.
     *
     * @param hours   total time in hours
     * @param minutes total time in minutes.
     * @param seconds total time in seconds.
     */
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Returns the total time in seconds.
     */
    public int getTotalSeconds() {
        return seconds + minutes * SECONDS_TO_MINUTE + hours * SECONDS_TO_HOUR;
    }
}
