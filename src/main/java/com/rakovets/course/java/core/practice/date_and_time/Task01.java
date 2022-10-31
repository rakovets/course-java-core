package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task01 {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate dateAfterNMonths(LocalDate localDate, int nMonths) {
        return localDate.plusMonths(nMonths);
    }

    public String getStringFromPattern(LocalDate localDate, String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return localDate.format(dtf);
    }

    public LocalDate getLocalDateFromPattern(String date, String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return LocalDate.parse(date, dtf);
    }

    public int getDaysBetween(LocalDate localDate1, LocalDate localDate2) {
        return (int) (localDate2.toEpochDay() - localDate1.toEpochDay());
    }
}
