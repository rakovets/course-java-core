package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(10, 33, 34);
        Time timeSeconds = new Time(5656444);

        System.out.println("Hours: " + time.getHours());
        System.out.println("Minutes: " + time.getMinutes());
        System.out.println("Seconds: " + time.getSeconds());
        System.out.println("Total seconds: " + time.getTotalSeconds());
        System.out.println();

        time.setHours(8);
        time.setMinutes(59);
        time.setSeconds(37);

        System.out.println("Set hours: " + time.getHours());
        System.out.println("Set minutes: " + time.getMinutes());
        System.out.println("Set seconds: " + time.getSeconds());
        System.out.println("Total seconds: " + time.getTotalSeconds());
        System.out.println();

        System.out.println("Set hours: " + timeSeconds.getHours());
        System.out.println("Set minutes: " + timeSeconds.getMinutes());
        System.out.println("Set seconds: " + timeSeconds.getSeconds());
        System.out.println("Total seconds: " + timeSeconds.getTotalSeconds());
        System.out.println();

        timeSeconds.setHours(55);
        timeSeconds.setMinutes(26);
        timeSeconds.setSeconds(45);

        System.out.println("Set hours: " + timeSeconds.getHours());
        System.out.println("Set minutes: " + timeSeconds.getMinutes());
        System.out.println("Set seconds: " + timeSeconds.getSeconds());
        System.out.println("Total seconds: " + timeSeconds.getTotalSeconds());
    }
}
