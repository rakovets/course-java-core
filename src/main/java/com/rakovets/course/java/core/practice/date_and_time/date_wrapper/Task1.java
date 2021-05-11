package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task1 {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getLocalDateAddMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String getStringDatePatern(LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }

    public static LocalDate getLocalDateFormat(String localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return LocalDate.parse(localDate, dateTimeFormatter);
    }

    public static long daysBetween(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
