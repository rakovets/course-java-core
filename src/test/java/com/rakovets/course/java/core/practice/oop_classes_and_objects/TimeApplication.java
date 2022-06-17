package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[]args) {
        Time time1 = new Time(27, 55, 0);

        System.out.println("This hours: " + time1.getHours());
        System.out.println("This minutes: " + time1.getMinutes());
        System.out.println("This seconds: " + time1.getSeconds());
        System.out.println("Total seconds: " + time1.getTotalSeconds());

        time1.setHours(1);
        time1.setMinutes(2);
        time1.setSeconds(3);

        System.out.println("This hours after setting: " + time1.getHours());
        System.out.println("This minutes after setting: " + time1.getMinutes());
        System.out.println("This seconds after setting: " + time1.getSeconds());
        System.out.println("Total seconds after setting: " + time1.getTotalSeconds());

        Time time2 = new Time(100500);

        System.out.println("This hours: " + time2.getHours());
        System.out.println("This minutes: " + time2.getMinutes());
        System.out.println("This seconds: " + time2.getSeconds());
        System.out.println("Total seconds: " + time2.getTotalSeconds());

        time2.setHours(10);
        time2.setMinutes(20);
        time2.setSeconds(30);

        System.out.println("This hours after setting: " + time2.getHours());
        System.out.println("This minutes after setting: " + time2.getMinutes());
        System.out.println("This seconds after setting: " + time2.getSeconds());
        System.out.println("Total seconds after setting: " + time2.getTotalSeconds());
    }
}
