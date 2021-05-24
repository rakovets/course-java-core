package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task2;

import java.time.LocalDate;

public class Task2Demo {
    public static void main(String[] args) {
        System.out.println(Task2.addNDays(LocalDate.now(),3));
        System.out.println(Task2.changesDateFirstDayOfYear(LocalDate.of(2011,7,11)));
    }
}
