package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeTest {
    public static void main(String[] args) {

        int hours = 4;
        int minutes = 18;
        int seconds = 58;

        Time time = new Time(hours, minutes, seconds);
        System.out.printf("\nTotal time in seconds: %d", time.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());

        hours = 5;
        minutes = 5;
        seconds = 0;

        time.setHours(hours);
        time.setMinutes(minutes);
        time.setSeconds(seconds);

        System.out.printf("\nTotal time in seconds: %d", time.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());

        long totalTimeInSeconds = 1554785;
        Time totalTime = new Time(totalTimeInSeconds);
        System.out.printf("\nTotal time in seconds: %d", totalTime.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d\n", totalTime.getHours(), totalTime.getMinutes(), totalTime.getSeconds());
    }
}
