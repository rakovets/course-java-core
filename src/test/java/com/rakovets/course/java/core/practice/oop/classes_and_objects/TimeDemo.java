package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.sql.SQLOutput;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(16,20,30);
        System.out.printf("Time is %d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d seconds", time.getTotalSeconds());
    }
}
