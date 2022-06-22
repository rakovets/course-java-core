package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(17, 36, 23);
        System.out.println("This: " + time.getHours() + " hours " + time.getMinute() + " minute " + time.getSeconds() + " seconds.");
        int totalTime = time.getHours() * 3600 + time.getMinute() * 60 + time.getSeconds();
        System.out.println("This: " + totalTime + " seconds.");
    }
}
