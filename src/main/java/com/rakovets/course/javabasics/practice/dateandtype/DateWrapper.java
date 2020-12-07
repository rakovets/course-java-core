package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateWrapper {

    public static LocalDate getTime(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getPlusnMonth(LocalDate current, int month) {
        return current.plusMonths(month);
    }

    public static String getLocalDateOfFormat(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern, Locale.US));
    }

    public static String getLocalDateOfFormat(String date, String pattern) {
        return LocalDate.parse(date).format(DateTimeFormatter.ofPattern(pattern, Locale.US));
    }

    public static long getDays(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static TemporalAdjuster plusDays(int ndays) {
        return temporal -> temporal.plus(Period.ofDays(ndays));
    }

    public static TemporalAdjuster changeDay() {
        return temporal ->
                ChronoUnit.DAYS.between(
                        temporal.with(TemporalAdjusters.firstDayOfYear()),
                        temporal
                ) < ChronoUnit.DAYS.between(
                        temporal,
                        temporal.with(TemporalAdjusters.firstDayOfNextYear())
                ) ? temporal.with(TemporalAdjusters.firstDayOfYear()) :
                        temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }

}
