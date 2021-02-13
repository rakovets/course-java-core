package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

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

    public static LocalDate getDateAfterDays (LocalDate date, int days) {
        TemporalAdjuster afterDays = (temporal) -> temporal.plus(days, DAYS);
        return (LocalDate) afterDays.adjustInto(date);
    }

    public static TemporalAdjuster closestNewYear = (temporal) ->
            Math.abs(DAYS.between(temporal, temporal.with(TemporalAdjusters.firstDayOfYear()))) >= 183L
                    ? temporal.with(TemporalAdjusters.firstDayOfNextYear())
                    : temporal.with(TemporalAdjusters.firstDayOfYear());
}
