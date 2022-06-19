package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(3,9, 32);
        System.out.println("Hours: " + time.getHours());
        System.out.println("Minutes: " + time.getMinutes());
        System.out.println("Seconds: " + time.getSeconds());
        System.out.println("Total seconds: " + time.getTotalSeconds());
    }
}
