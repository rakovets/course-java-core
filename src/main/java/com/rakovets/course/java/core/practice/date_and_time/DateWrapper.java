package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return  LocalDate.of(year, month, day);
    }

    public static LocalDate getNextDateWithMonth(LocalDate date, int month) {
        return date.plusMonths(month);
    }

    public static String getDateByPattern(LocalDate date, String formatter) {
        return date.format(DateTimeFormatter.ofPattern(formatter));
    }

    public static LocalDate getLocalDateByPattern(String date, String formatter) {

        return LocalDate.parse(date, DateTimeFormatter.ofPattern(formatter));
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
