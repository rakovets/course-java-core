package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time (int totalSeconds) {
        hours = totalSeconds / 3600;
        minutes = (totalSeconds - hours * 3600) / 60;
        seconds = totalSeconds % 60;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}

4. Создать *Methods*:

        * `getHours()`
        * `setHours(hours)`
        * `getMinutes()`
        * `setMinutes(minutes)`
        * `getSeconds()`
        * `setSeconds()`
        * `getTotalSeconds()` - возвращает общее время в секундах
