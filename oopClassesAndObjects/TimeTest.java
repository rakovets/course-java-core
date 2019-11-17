package com.rakovets.course.challenge.oopClassesAndObjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(1, 1, 1);
        time1.display();
        Time time2 = new Time(1027);
        time2.display();

        System.out.printf("%d, %d, %d\n", time1.getHour(), time1.getMin(), time1.getSec());

        System.out.println(time1.getSeconds());
    }
}
