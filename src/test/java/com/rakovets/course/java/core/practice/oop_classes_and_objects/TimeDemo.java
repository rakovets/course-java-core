package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(58240);

        System.out.print("Hours: " + time.getHours());
        System.out.print(", minutes: " + time.getMinutes());
        System.out.print(", seconds: " + time.getSeconds());
        System.out.print(", total seconds: " + time.getTotalSeconds());
        System.out.println();

        time.setHours(12);
        time.setMinutes(14);
        time.setSeconds(16);

        System.out.print("Hours: " + time.getHours());
        System.out.print(", minutes: " + time.getMinutes());
        System.out.print(", seconds: " + time.getSeconds());
        System.out.print(", total seconds: " + time.getTotalSeconds());
        System.out.println();

        time.setHours(12);
        time.setMinutes(39);
        time.setSeconds(42);

        System.out.print("Hours: " + time.getHours());
        System.out.print(", minutes: " + time.getMinutes());
        System.out.print(", seconds: " + time.getSeconds());
        System.out.print(", total seconds: " + time.getTotalSeconds());
        System.out.println();
    }
}
