package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Task01 {
    public LocalDate returnLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate increaseLocalDateByInputMonth(LocalDate localDate, long month) {
        return localDate.plusMonths(month);
    }

    public String changeLocalDateByPattern(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public LocalDate returnLocalDateByPattern(String localDateInStringFormat, DateTimeFormatter formatter) {
        return LocalDate.parse(localDateInStringFormat, formatter);
    }

    public long countDaysBetweenLocalDates(LocalDate startLocalDate, LocalDate finalLocalDate) {
        return DAYS.between(finalLocalDate, startLocalDate);
    }
}
