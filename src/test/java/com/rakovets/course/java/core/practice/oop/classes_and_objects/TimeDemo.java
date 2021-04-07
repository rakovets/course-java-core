package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(8,20,45);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());

        time.setHours(6);
        time.setMinutes(10);
        time.setSeconds(50);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());
    }
}
