package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class ExampleTask01 {
    public static void main(String[] args) {
        Time firstTimeValue = new Time(23, 14,15);
        Time secondTimeValue = new Time(185);
        System.out.printf("TotalSeconds:\n%d\n%d", firstTimeValue.getTotalSeconds(), secondTimeValue.getTotalSeconds());
    }
}
