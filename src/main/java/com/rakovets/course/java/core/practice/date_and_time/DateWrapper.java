package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return  LocalDate.of(year, month, day);
    }

    public static LocalDate nextDate(int month) {
        return LocalDate.now().plusMonths(month);
    }

    public static String getDateByPattern(LocalDate date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    public static LocalDate getLocalDateByPattern(String date, DateTimeFormatter formatter) {

        return LocalDate.parse(date, formatter);
    }

    public static long getDaysCount(LocalDate date1, LocalDate date2) {
        return Math.abs(DAYS.between(date1, date2));
    }

    public static LocalDate addDays(LocalDate date, int days) {
        TemporalAdjuster adjuster = (temporal) -> temporal.plus(days, DAYS);

        return (LocalDate) adjuster.adjustInto(date);
    }

    public static LocalDate closestFirstDay(LocalDate date) {
        int dayYear = date.get(ChronoField.DAY_OF_YEAR);

        if (dayYear < 183) {
            return date.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return date.with(TemporalAdjusters.firstDayOfNextYear());
        }
    }
}
