package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateWrapper {
    public static LocalDate getLocalDate (int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate dateAfterNMonth(LocalDate date, int amountMonth) {
        return date.plusMonths(amountMonth);
    }

    public static String dateFormat(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static LocalDate dateFormat(String time, String pattern) {
        return LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern, Locale.UK));
    }

    public static int amountDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        Period days = Period.between(firstDate, secondDate);
        return days.getDays();
    }
}
