package com.rakovets.course.challenge.classes;

public class TimeTest {
    public static void main(String[] args) {
        Time testingTime = new Time(15, 15, 15);
        System.out.println("Getting hours: " + testingTime.getHours());
        System.out.println("Getting minutes: " + testingTime.getMinutes());
        System.out.println("Getting seconds: " + testingTime.getSeconds());
        System.out.println("Getting total seconds: " + testingTime.getTotalSeconds());
        System.out.println("Now i am going to set different time, namely: 22h, 21m, 20s");
        testingTime.setHours(22);
        testingTime.setMinutes(21);
        testingTime.setSeconds(20);
        System.out.println("Getting hours: " + testingTime.getHours());
        System.out.println("Getting minutes: " + testingTime.getMinutes());
        System.out.println("Getting seconds: " + testingTime.getSeconds());
        System.out.println("Getting total seconds: " + testingTime.getTotalSeconds());
    }
}
