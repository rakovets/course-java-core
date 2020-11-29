package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class DemoOfTask2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 07, 5);
        Task2 date1 = new Task2(date);
        date1.addDaysToDate(30);
        System.out.println(date1.getDate());
    }
}
