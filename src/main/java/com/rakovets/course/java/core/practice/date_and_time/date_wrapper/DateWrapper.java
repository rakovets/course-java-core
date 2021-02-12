package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int days) {
        return LocalDate.of(year, month, days);
    }

    public static LocalDate getLocalDateAfterMonth(LocalDate now, int month) {
        return now.plusMonths(month);
    }

    public static String formatLocalDate(LocalDate now, DateTimeFormatter formatter) {
        return now.format(formatter);
    }

    public static LocalDate parseStringToLocalDate(String string, DateTimeFormatter formatter) {
        return LocalDate.parse(string, formatter);
    }

    public static long getDaysBetweenDates(LocalDate first, LocalDate second) {
        return Math.abs(DAYS.between(first, second));
    }
}
