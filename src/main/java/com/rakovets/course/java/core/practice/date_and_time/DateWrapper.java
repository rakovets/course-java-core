package com.rakovets.course.java.core.practice.date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.*;


import static java.time.temporal.ChronoUnit.DAYS;

public abstract class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int days) {
        return LocalDate.of(year, month, days);
    }

    public static LocalDate getDateAfterMonth(LocalDate now, int month) {
        return now.plusMonths(month);
    }

    public static String formatDateToString(LocalDate now, DateTimeFormatter formatter) {
        return now.format(formatter);
    }

    public static LocalDate parseStringToDate(String string, DateTimeFormatter formatter) {
        return LocalDate.parse(string, formatter);
    }

    public static long getDaysBetweenDates(LocalDate first, LocalDate second) {
        return Math.abs(DAYS.between(first, second));
    }

    public static LocalDate getDateAfterDays (LocalDate date, int days) {
        TemporalAdjuster afterDays = temporal -> temporal.plus(days, DAYS);
        return (LocalDate) afterDays.adjustInto(date);
    }

    public static TemporalAdjuster closestNewYear = temporal ->
            (temporal.get(ChronoField.DAY_OF_YEAR) >= (temporal.range(ChronoField.DAY_OF_YEAR).getMaximum() / 2))
                    ? temporal.with(TemporalAdjusters.firstDayOfNextYear())
                    : temporal.with(TemporalAdjusters.firstDayOfYear());

    public static Date getDate(int year, int month, int days) throws ParseException {
        String string = days + "." + month + "." + year;
        return new SimpleDateFormat("dd.MM.yyyy").parse(string);
    }
}
