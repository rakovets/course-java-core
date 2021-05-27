package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {
    public static LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getChangeLocalDate(LocalDate localDate, int countMonths) {
        return localDate.plusMonths(countMonths);
    }

    public static String getLocalDateToStringFormat(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate getStringFormatToLocalDate(String text, DateTimeFormatter formatter) {
        return LocalDate.parse(text, formatter);
    }

    public static long getNumberOfDays(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
