package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time hours = new Time(1);
        Time minutes = new Time(2);
        Time seconds = new Time(3);
        Time totalseconds = new Time (156);
        System.out.println(hours.getHours());
        System.out.println(minutes.getMinutes());
        System.out.println(seconds.getSeconds());
        System.out.println(totalseconds.getTotalSeconds());

        hours.setHours(666);
        minutes.setMinutes(333);
        seconds.setSeconds(222);
        System.out.println(hours.getHours());
        System.out.println(minutes.getMinutes());
        System.out.println(seconds.getSeconds());
    }
}
