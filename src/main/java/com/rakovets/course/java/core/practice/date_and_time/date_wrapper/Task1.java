package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Locale;

public class Task1 {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getDateAfterQuantityNMonth(LocalDate date, int quantityNMonth) {
        return date.plusMonths(quantityNMonth);
    }

    public static String getDateFormatPattern(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static LocalDate getLocalDateFormatPattern(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static long getQuantityDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }

    public static Temporal addNDays(Temporal temporal, int quantityDays){
        return temporal.plus(quantityDays, ChronoUnit.DAYS);
    }
}
