package com.rakovets.course.challenge.OOP.classesAndObject;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(2, 100, 200);
        System.out.println("Hours increased by 2: " + time1.getHours());
        System.out.println("Minutes decreased by 2: " + time1.getMinutes());
        System.out.println("Seconds without changes: " +  time1.getSeconds());
        System.out.printf("All seconds: %s \n\n", time1.getTotalSeconds());

        System.out.printf("Constructor 2: \n\n");

        Time time2 = new Time(148);
        time2.setHours(5);
        time2.setMinutes(20);
        time2.setSeconds();
        System.out.println("Hours increased by 2: " + time2.getHours());
        System.out.println("Minutes decreased by 2: " + time2.getMinutes());
        System.out.println("Seconds without changes: " +  time2.getSeconds());

    }
}