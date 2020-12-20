package com.rakovets.course.javabasics.example.dateandtime.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        Month monthAsEnum = today.getMonth(); // как перечисление
        int dayYear = today.getDayOfYear();
        int dayMonth = today.getDayOfMonth();
        DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeekEnum);
    }
}
