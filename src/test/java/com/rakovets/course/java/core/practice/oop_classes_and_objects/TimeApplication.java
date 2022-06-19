package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {

    public static void main(String[] args) {
        Time time = new Time(10, 20, 40);
        System.out.println("Hours: " + time.getHours());
        System.out.println("Minutes: " + time.getMinutes());
        System.out.println("Seconds: " + time.getSeconds());

        Time timeInSeconds = new Time(1560);
        System.out.println("All seconds: " + timeInSeconds.getSeconds());

        System.out.println("Hours: " + time.setHours(10));
        System.out.println("Minutes: " + time.setMinutes(20));
        System.out.println("Seconds: : " + time.setSeconds(15));
        System.out.println("Total seconds: " + time.getTotalSeconds());

    }
}
