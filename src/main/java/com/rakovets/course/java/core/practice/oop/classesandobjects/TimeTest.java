package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time test1 = new Time(100000);
        Time test2 = new Time(10,48,44);

        //test1
        System.out.printf("Total second is: %d, and this is:\n %d hours\n %d minutes\n %d second\n", test1.getTotalSecond(),test1.getHours(), test1.getMinutes(), test1.getSeconds());
        //test2
        System.out.printf("%d hours\n %d minutes\n %d second\n", test2.getHours(), test2.getMinutes(), test2.getSeconds());
    }
}
