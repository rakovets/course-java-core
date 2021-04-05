package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(12345);
        Time bestTime = new Time (1, 2, 3);

        bestTime.setHours(2);
        bestTime.setMinutes(3);
        bestTime.setSeconds(4);

        System.out.println(bestTime.getHours());
        System.out.println(bestTime.getMinutes());
        System.out.println(bestTime.getSeconds());

        System.out.println(bestTime.getTotalSeconds());
    }
}
