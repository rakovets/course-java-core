package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task1 {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateAddMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public String getStringDatePatern(LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ofPattern("d.M.yyyy"));
    }

    public LocalDate getLocalDateFormat(String localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return LocalDate.parse(localDate, dateTimeFormatter);
    }

    public long daysBetween(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
