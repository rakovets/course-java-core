package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(56809);
        System.out.printf("%d:%d:%d\n",time.getHours(),time.getMinutes(), time.getSeconds());
        System.out.printf("Total : %d\n", time.getTotalSeconds());
        Time tt = new Time(10,34,58);
        System.out.printf("Total : %d", tt.getTotalSeconds());
    }

}
