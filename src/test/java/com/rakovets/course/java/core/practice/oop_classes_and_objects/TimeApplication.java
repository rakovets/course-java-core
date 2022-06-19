package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time now = new Time(12, 45, 10);
        System.out.println("Now time is " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds());
        now.setHours(13);
        now.setMinutes(12);
        now.setSeconds(11);
        System.out.println("Now time is " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds());

        Time yesterday = new Time(2856);
        System.out.println("Yesterday time was " + yesterday.getHours() + ":" + yesterday.getMinutes() + ":" + yesterday.getSeconds());
        System.out.println("Yesterday total time in seconds was " + yesterday.getTotalSeconds());
    }
}
