package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(3671);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinute(), time.getSeconds());

        Time time1 = new Time(1,2,5);
        System.out.printf("%d:%d:%d\n", time1.getHours(), time1.getMinute(), time1.getSeconds());

        time1.setHours(2);
        time1.setMinute(33);
        time1.setSeconds(44);
        System.out.printf("%d:%d:%d\n", time1.getHours(), time1.getMinute(), time1.getSeconds());

        System.out.printf("%d", time1.getTotalSeconds());
    }
}
