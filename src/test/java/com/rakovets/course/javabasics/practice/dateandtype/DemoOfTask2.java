package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class DemoOfTask2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 7, 25);
        Task2 temporalAdjuster = new Task2();
        LocalDate newDate = (LocalDate) temporalAdjuster.adjustIntoPlusDays(date, 10);
        System.out.println(newDate);

        LocalDate newYearDate = (LocalDate) temporalAdjuster.adjustIntoNewYear(newDate);
        System.out.println(newYearDate);
    }
}
