package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time testTime = new Time(8000);
        Time testTime2 = new Time(4, 45, 12);

        System.out.printf("%d, %d, %d\n", testTime.getHours(), testTime.getSeconds(), testTime.getMinutes());
        System.out.printf("%d, %d, %d\n", testTime2.getHours(), testTime2.getSeconds(), testTime2.getMinutes());

        testTime.setHours(74);
        testTime.setMinutes(55);
        testTime.setSeconds(1);

        testTime2.setHours(74);
        testTime2.setMinutes(55);
        testTime2.setSeconds(1);

        System.out.println(testTime.getTotalSeconds());
        System.out.println(testTime2.getTotalSeconds());
    }
}
