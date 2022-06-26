package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time1 = new Time(12, 15, 57);
        System.out.println("Time: " + time1.getHours() + " hours " + time1.getMinute() + " minute " + time1.getSeconds() + " seconds, " + "this = " + time1.getTotalSeconds() + " seconds.");

        Time time2 = new Time(12500);
        System.out.println("Time = " + time2.getTotalSeconds() + " seconds, this: " + time2.getHours() + " hours " + time2.getMinute() + " minute " + time2.getSeconds() + " seconds.");
    }
}
