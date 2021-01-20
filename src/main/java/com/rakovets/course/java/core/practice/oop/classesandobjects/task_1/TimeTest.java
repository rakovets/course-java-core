package com.rakovets.course.java.core.practice.oop.classesandobjects.task_1;

import com.rakovets.course.java.core.practice.oop.classesandobjects.task_1.model.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time seconds = new Time (15025);
        seconds.getHours();
        seconds.getMinutes();
        seconds.getSeconds();
        Time hours = new Time (12,5,8);
        hours.getTotalseconds();
    }
}
