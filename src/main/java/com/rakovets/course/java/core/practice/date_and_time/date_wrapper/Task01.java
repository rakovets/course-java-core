package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task01 {
    public LocalDate returnDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate returnDateAfterMonths(LocalDate date, int numberMonths) {
        return date.plusMonths(numberMonths);
    }

    public String returnStringDateByPattern(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));
    }

    public LocalDate returnDateByPattern(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));
    }

    public long returnNumberDaysBetweenDates(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
