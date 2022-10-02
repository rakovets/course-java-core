package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time1 = new Time(5,45,19);
        Time time2 = new Time (4587586);

        System.out.printf("First time is: %d hours, %d minutes, %d seconds, %d total seconds.\n",
                time1.getHours(), time1.getMinutes(), time1.getSeconds(), time1.getTotalSeconds());

        time1.setHours(12);
        time1.setMinutes(10);
        time1.setSeconds(14);

        System.out.printf("Now first time is: %d hours, %d minutes, %d seconds, %d total seconds.",
                time1.getHours(), time1.getMinutes(), time1.getSeconds(), time1.getTotalSeconds());
    }
}
