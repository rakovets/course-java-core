package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateWrapper {

    public static LocalDate getLocalDate (int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate dateAfterNMonth(LocalDate date, int amountMonth) {
        return date.plusMonths(amountMonth);
    }

    public static String dateFormat(LocalDate date, String text) {
        return date.format(DateTimeFormatter.ofPattern(text, Locale.UK));
    }
}
