package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(5,15,45);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        Time totalSeconds = new Time(33333);
        System.out.printf("%d\n", time.getTotalSeconds());
        time.setHours(11);
        time.setMinutes(44);
        time.setSeconds(51);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());
    }
}
