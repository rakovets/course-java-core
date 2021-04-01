package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(56809);
        System.out.printf("%d:%d:%d",time.getHours(),time.getMinutes(), time.getSeconds());
    }

}
