package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.sql.SQLOutput;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(16,20,30);
        System.out.printf("\nTime is %d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d seconds\n", time.getTotalSeconds());
        time.setHours(5);
        time.setMinutes(33);
        time.setSeconds(20);
        System.out.printf("\nTime is %d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d seconds\n", time.getTotalSeconds());
    }
}
