package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeApplication {
    public static void main(String[] args) {
        Time time = new Time(3,32,42);
        System.out.print("This time is: " + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());

    }
}
