package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DateWrapper {
    public static LocalDate getTime(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getLocalDateFromNMonth(LocalDate time, int month) {
        return time.plusMonths(month);
    }

    public static String getLocalDateInString(LocalDate time, DateTimeFormatter pattern) {
        return time.format(pattern);
    }

    public static LocalDate getLocaleDateFromString(String time, DateTimeFormatter pattern) {
        return LocalDate.parse(time, pattern);
    }

    public static int getCountOfDaysBetweenDates(LocalDate time, LocalDate time1) {
        return (int) ChronoUnit.DAYS.between(time, time1);
    }

    public static LocalDate addDays(LocalDate localDate, int days) {
        return localDate.plusDays(days);
    }
}
