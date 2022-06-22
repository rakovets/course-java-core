package com.rakovets.course.java.core.practice.oop_classes_and_objects;

class TimeApplication {
    public static void main(String[] args) {
        Time test1 = new Time(1, 20, -3);
        Time test2 = new Time(3672);
        System.out.println(test1.getTotalSeconds());
        System.out.println(test1.getHours());
        System.out.println(test1.getMinutes());
        System.out.println(test1.getSeconds());
        test1.setHours(0);
        test1.setMinutes(23);
        test1.setSeconds(1);
        System.out.println(test1.getTotalSeconds());
        System.out.println(test2.getTotalSeconds());
        System.out.println(test2.getHours());
        System.out.println(test2.getMinutes());
        System.out.println(test2.getSeconds());
        test2.setHours(2);
        test2.setMinutes(61);
        test2.setSeconds(20);
        System.out.println(test2.getTotalSeconds());
    }
}
