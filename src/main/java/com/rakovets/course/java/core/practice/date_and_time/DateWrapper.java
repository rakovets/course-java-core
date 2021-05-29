package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

public class DateWrapper {
    public static LocalDate changeToLocalDate(int year,int month,int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate changeMonthInLocalDate(LocalDate month,int changeToNMonth) {
        return  month.plusMonths(changeToNMonth);
    }

    public static String changeLocalDateToStringWithPattern(LocalDate date, DateTimeFormatter pattern) {
        return date.format(pattern);
    }

    public static LocalDate changeStringToLocalDateWithPattern(String date, DateTimeFormatter pattern) {
        return LocalDate.parse(date,pattern);
    }

    public static long getDaysBetweenDates (LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate,secondDate);
    }

}
