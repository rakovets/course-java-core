package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DateWrapper {
    public static LocalDate dMY(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate monthLocal(LocalDate date, int amountmonth) {
        return date.plusMonths(amountmonth);
    }

    public static String patternOfDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate stringPattern(String time, String pattern) {
        return LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static long daysBetweenDates(LocalDate first, LocalDate second) {
        return ChronoUnit.DAYS.between(first, second);
    }

}
