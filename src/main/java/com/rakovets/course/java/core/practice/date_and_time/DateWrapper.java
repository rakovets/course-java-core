package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateWrapper {
    public static LocalDate localDate(int year, int months, int day) {
        return LocalDate.of(year, months, day);
    }

    public static LocalDate addToLocalDate(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String patternLocalDate(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate patternLocalDateString(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    public static long differenceLocalDate(LocalDate firstLocalDate, LocalDate secondLocalDate) {
        return Math.abs(ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate));
    }

    public static TemporalAdjuster plusDays(int day) {
        return temporal -> temporal.plus(Period.ofDays(day));
    }

    public static TemporalAdjuster nearNewYear() {
        return temporal ->
                ChronoUnit.DAYS.between(
                        temporal.with(TemporalAdjusters.firstDayOfYear()),
                        temporal
                ) >= ChronoUnit.DAYS.between(
                        temporal,
                        temporal.with(TemporalAdjusters.firstDayOfNextYear())
                ) ? temporal.with(TemporalAdjusters.firstDayOfNextYear()) :
                        temporal.with(TemporalAdjusters.firstDayOfYear());
    }
}
