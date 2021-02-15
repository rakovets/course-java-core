package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;
import java.util.regex.Pattern;

public class DateWrapper {
    public static LocalDate createLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate changeMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public static String localDatePattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static String localDateFormat(String localDate, String pattern) {
        return LocalDate.parse(localDate).format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static int dayBetween(LocalDate day1, LocalDate day2) {
        return (int) ChronoUnit.DAYS.between(day1,day2);
    }

    public static TemporalAdjuster addDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }
}
