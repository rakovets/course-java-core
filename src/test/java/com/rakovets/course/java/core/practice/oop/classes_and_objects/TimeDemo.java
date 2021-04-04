package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(3, 20, 35);
        Time totalTime = new Time(15220);
        System.out.printf("Time - %d hours %d minutes %d seconds\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("TotalTime - %d hours %d minutes %d seconds\n", totalTime.getHours(), totalTime.getMinutes(), totalTime.getSeconds());
        totalTime.setHours(10);
        totalTime.setMinutes(25);
        totalTime.setSeconds(35);
        System.out.printf("Total seconds - %d seconds\n", totalTime.getTotalSeconds());
    }
}
