package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 3);
        System.out.println("Hours:" + time.getHours() + "; Minute:" + time.getMinutes() + "; Seconds:" + time.getSeconds());
        System.out.println("Total seconds =" + time.getTotalSeconds());
        time.setHours(4);
        time.setMinutes(5);
        time.setSeconds(6);
        System.out.println("Hours:" + time.getHours() + "; Minute:" + time.getMinutes() + "; Seconds:" + time.getSeconds());
        System.out.println("Total seconds =" + time.getTotalSeconds());

        Time totalSecondsTime = new Time(12345);
        System.out.println("Hours:" + totalSecondsTime.getHours() + "; Minute:" + totalSecondsTime.getMinutes() + "; Seconds:" + totalSecondsTime.getSeconds());
    }
}
