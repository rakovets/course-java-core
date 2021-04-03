package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time (30, 20, 50);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());
        time.setHours(12);
        time.setMinutes(26);
        time.setSeconds(54);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());
    }
}
