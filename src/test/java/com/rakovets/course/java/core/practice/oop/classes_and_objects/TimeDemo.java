package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args){
        Time totalTime = new Time(15678);
        Time time = new Time(1, 5, 7);
        System.out.printf("%d:%d:%d\n", totalTime.getHours(), totalTime.getMinutes(), totalTime.getSeconds());
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        time.setHours(2);
        time.setMinutes(50);
        time.setSeconds(25);
        System.out.printf("%d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("total seconds: %d\n", time.getTotalseconds());
    }
}
