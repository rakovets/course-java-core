package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeTest {
    public static void main(String[] args) {
        Time testTime1 = new Time(3635);
        Time testTime2 = new Time(1, 10, 10);

        System.out.printf("Current time for testTime1 is %s hours, %s minutes, " +
                        "%s seconds and total seconds are %s.%n",
                testTime1.getHours(), testTime1.getMinutes(), testTime1.getSeconds(), testTime1.getTotalSeconds());
        System.out.printf("Current time for testTime2 is %s hours, %s minutes, " +
                        "%s seconds and total seconds are %s.%n",
                testTime2.getHours(), testTime2.getMinutes(), testTime2.getSeconds(), testTime2.getTotalSeconds());

        testTime1.setHours(2);
        testTime1.setMinutes(2);
        testTime1.setSeconds(2);

        System.out.println();
        System.out.printf("Current time for testTime1 is %s hours, %s minutes, " +
                        "%s seconds and total seconds are %s.%n",
                testTime1.getHours(), testTime1.getMinutes(), testTime1.getSeconds(), testTime1.getTotalSeconds());
        System.out.printf("Current time for testTime2 is %s hours, %s minutes, " +
                        "%s seconds and total seconds are %s.%n",
                testTime2.getHours(), testTime2.getMinutes(), testTime2.getSeconds(),
                testTime2.getTotalSeconds());
    }
}
