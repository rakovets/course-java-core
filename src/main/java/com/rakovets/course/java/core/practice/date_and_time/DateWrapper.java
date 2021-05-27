package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {
    public static LocalDate returnLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getLocalDateAfterFewMonth(LocalDate localDate, int month) {
        return LocalDate.of(localDate.getYear(), localDate.plusMonths(month).getMonth(), localDate.getDayOfMonth());
    }

    public static String getStringDatePattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate getLocalDateFormat(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    public static long periodDays(LocalDate firstLocalDate, LocalDate secondLocalDate) {
        return ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate);
    }
}
