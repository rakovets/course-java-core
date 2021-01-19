package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class TimeInitialization {
    public static void main(String[] args) {
        Time lesson = new Time(123153);
        System.out.println(lesson.getHours() + ":" + lesson.getMinutes() + ":" + lesson.getSeconds());

        Time playtime = new Time(23, 55, 48);
        System.out.println(playtime.getHours() + ":" + playtime.getMinutes() + ":" + playtime.getSeconds());
        playtime.setMinutes(345);
        playtime.setSeconds(10);
        playtime.setHours(6);
        playtime.setHours(-86);
        System.out.println(playtime.getHours() + ":" + playtime.getMinutes() + ":" + playtime.getSeconds());
        System.out.println(playtime.getTotalSeconds());
    }
}
