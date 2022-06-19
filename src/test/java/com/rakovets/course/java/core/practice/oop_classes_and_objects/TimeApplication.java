package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {

        Time fullTime = new Time(1,5, 6);

        fullTime.setHours(1);
        System.out.println("Hours: " + fullTime.getHours());

        fullTime.setMinutes(1);
        System.out.println("Minutes: " + fullTime.getMinutes());

        fullTime.setSeconds(1);
        System.out.println("Seconds: " + fullTime.getSeconds());

        System.out.println("Total seconds: " + fullTime.getTotalSeconds());
    }
}
