package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateWrapper extends AdjustInto {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate addMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String localDatePattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));
    }

    public static LocalDate localDateFormat(String localDate, String pattern) {
        return LocalDate.parse(localDate, DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));
    }

    public static int daysBetweenLocalDates(LocalDate localDateOne, LocalDate localDateTwo) {
        return (int) ChronoUnit.DAYS.between(localDateOne, localDateTwo);
    }

    public static TemporalAdjuster addDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }

    private static LocalDate getDate(Date date) {
        return LocalDate.ofInstant(date.toInstant(),
                ZoneId.systemDefault());
    }

    private static LocalDate calendarDate(Calendar calendar) {
        return LocalDate.ofInstant(calendar.toInstant(),
                ZoneId.systemDefault());
    }

    public static LocalDate addMonthsDate(Date date, int months) {
        return addMonths(getDate(date), months);
    }

    public static String datePattern(Date date, String pattern) {
        return localDatePattern(getDate(date), pattern);
    }

    public static String calendarDatePattern(Calendar calendar, String pattern) {
        return localDatePattern(calendarDate(calendar), pattern);
    }

    public static LocalDate addMonthsCalendar(Calendar calendar, int months) {
        return addMonths(calendarDate(calendar), months);
    }
}
