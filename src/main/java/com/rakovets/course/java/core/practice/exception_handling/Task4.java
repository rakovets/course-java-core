package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.IllegalTimeException;

public class Task4 {
    private int currentHours;
    private int currentMinutes;

    public Task4(int hours, int minutes) {
        this.currentHours = hours;
        this.currentMinutes = minutes;
    }

    public void setCurrentTime(int hours, int minutes) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalTimeException("Valid values for hours from 0 to 23");
        }
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalTimeException("Valid values for minutes from 0 to 59");
        }
        this.currentHours = hours;
        this.currentMinutes = minutes;
    }
}
