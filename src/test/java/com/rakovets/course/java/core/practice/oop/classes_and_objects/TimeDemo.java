package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(0,10,30);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d\n", time.getTotalSeconds());
        }
    }
