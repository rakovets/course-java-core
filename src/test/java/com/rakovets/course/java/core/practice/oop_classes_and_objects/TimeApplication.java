package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(12,1,45);
        System.out.println("This Time: " + time.getHours()+ ":" + time.getMinutes() + ":" + time.getSeconds());
        time.setHours(11);
        time.setMinutes(2);
        time.setSeconds(50);
        System.out.println("This Time: " + time.getHours()+ ":" + time.getMinutes() + ":" + time.getSeconds());
        Time time1 = new Time(6200);
        System.out.println("This Total Seconds : " + time1.getTotalSeconds());
        System.out.println("This Time: " + time1.getHours()+ ":" + time1.getMinutes() + ":" + time1.getSeconds());
        time1.setHours(2);
        time1.setMinutes(10);
        time1.setSeconds(20);
        System.out.println("This Time: " + time1.getHours()+ ":" + time1.getMinutes() + ":" + time1.getSeconds());
        System.out.println("This Total Seconds : " + time1.getTotalSeconds());
    }
}
