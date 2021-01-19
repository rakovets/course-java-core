package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {

        Time firstTime = new Time(8472);
        System.out.println(firstTime.getTotalSeconds());

        Time secondTime = new Time(1, 4, 5);
        System.out.println(secondTime.getHours() + ":" + secondTime.getMinutes() + ":" + secondTime.getSeconds());
        secondTime.setHours(1);
        secondTime.setMinutes(2);
        secondTime.setSeconds(3);
        System.out.println(secondTime.getHours() + ":" + secondTime.getMinutes() + ":" + secondTime.getSeconds());
    }
}
