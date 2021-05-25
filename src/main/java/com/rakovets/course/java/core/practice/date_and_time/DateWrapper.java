package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;

public class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getDateAfterNMonth(LocalDate date, int amountMonth) {
        return date.plusMonths(amountMonth);
    }

    public static String getDateFormat(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static LocalDate getDateFormat(String time, String pattern) {
        return LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static long getAmountDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}
