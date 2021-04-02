package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 3);
        Time time1 = new Time(24923);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("%d:%d:%d\n",time1.getHours(), time1.getMinutes(), time1.getSeconds());
        time1.setHours(2);
        time1.setMinutes(5);
        time1.setSeconds(10);
        System.out.printf("%d:%d:%d\n",time1.getHours(), time1.getMinutes(), time1.getSeconds());
        System.out.printf("total seconds %d\n", time1.getTotalSeconds());
    }
}
