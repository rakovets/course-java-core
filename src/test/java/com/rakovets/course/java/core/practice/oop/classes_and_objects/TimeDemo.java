package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {

    public static void main(String[] args) {
        Time time = new Time(1,1,1);
        Time totalTime = new Time(3661);
        System.out.printf("%d", time.getTotalSeconds());
        System.out.printf("\n%d \n%d \n%d", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("\n%d", totalTime.getTotalSeconds());
        System.out.printf("\n%d \n%d \n%d", totalTime.getHours(), totalTime.getMinutes(), totalTime.getSeconds());
        time.setHours(2);
        time.setMinutes(2);
        time.setSeconds(2);
        System.out.printf("\n%d", time.getTotalSeconds());
        System.out.printf("\n%d \n%d \n%d", time.getHours(), time.getMinutes(), time.getSeconds());
    }
}
