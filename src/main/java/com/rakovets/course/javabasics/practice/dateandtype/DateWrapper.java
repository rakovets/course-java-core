package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getNewLocalDate(LocalDate date, int month) {
        return date.plusMonths(month);
    }

    public static String getLocalDateWithPattern(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }

    public static LocalDate getLocalDateWithNewPattern(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    public static Period getPeriodBetweenDates(LocalDate date1, LocalDate date2) {
        return Period.between(date1, date2);
    }

}
