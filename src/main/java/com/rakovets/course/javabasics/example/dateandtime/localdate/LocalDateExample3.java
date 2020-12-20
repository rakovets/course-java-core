package com.rakovets.course.javabasics.example.dateandtime.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int dayYear = today.get(ChronoField.DAY_OF_YEAR);
        int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
        int dayWeek = today.get(ChronoField.DAY_OF_WEEK);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeek);
    }
}
