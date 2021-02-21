package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateWrapper {

    public static LocalDate getDate(int years, int month, int days) {
        return LocalDate.of(years, month, days);
    }

    public static LocalDate getMonth(LocalDate localDate, int monthPlus) {
        return localDate.plusMonths(monthPlus);
    }

    public static String getPattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static Period getDayBetween(LocalDate localDate, LocalDate localDate2) {
        return Period.between(localDate, localDate2);
    }

    public static TemporalAdjuster addDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }

    public static TemporalAdjuster firstJanuary(LocalDate localDate) {
        int months = localDate.getMonthValue();
        if (months < 6)
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfYear());
        else
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }
}
