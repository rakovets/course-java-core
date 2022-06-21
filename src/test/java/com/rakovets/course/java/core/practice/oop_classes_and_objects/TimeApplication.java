package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(10, 50, 25);
        Time time1 = new Time(3672);

        System.out.println("Current time " + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        time.setHours(12);
        time.setMinutes(25);
        time.setSeconds(35);
        System.out.println("New time " + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        System.out.println("Total seconds = " + time.getTotalSeconds());
        System.out.println("Time counted from seconds: " + time1.getHours() + ":" + time1.getMinutes() + ":" + time1.getSeconds());
    }
}
