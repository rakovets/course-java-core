package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time (12345);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        time.setHours(3);
        time.setMinutes(15);
        time.setSeconds(36);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("total seconds %d\n", time.getTotalSeconds());
    }
}
