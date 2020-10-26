package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(1, 45, 33);
        Time totalSeconds = new Time (651);
        System.out.println(totalSeconds.getTotalSeconds());
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        System.out.println(time.getSeconds());


        time.setHours(666);
        time.setMinutes(333);
        time.setSeconds(222);
        System.out.println(time.getHours());
        System.out.println(time.getMinutes());
        System.out.println(time.getSeconds());
    }
}
