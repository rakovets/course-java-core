package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(10, 22, 45);
        System.out.println("Curent time: " + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        System.out.println("Total seconds: " + time.getTotalSeconds());
    }
}
