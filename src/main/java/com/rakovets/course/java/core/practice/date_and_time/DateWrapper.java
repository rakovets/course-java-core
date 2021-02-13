package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import static java.util.Locale.US;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate addMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String localDatePattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern, US));
    }

    public static String localDateFormat(String localDate, String pattern) {
        return LocalDate.parse(localDate).format(DateTimeFormatter.ofPattern(pattern, US));
    }

    public static int daysBetween(LocalDate localDate1, LocalDate localDate2) {
        return (int) ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static TemporalAdjuster addDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }

    public static TemporalAdjuster firstJanuary(LocalDate localDate) {
        int months = localDate.getMonthValue();
        if (months < 6)
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfYear());
        else
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }

    private static LocalDate getDate(Date date) {
        return LocalDate.ofInstant(date.toInstant(),
                ZoneId.systemDefault());
    }

    public static LocalDate addMonthsDate(Date date, int months) {
        return addMonths(getDate(date), months);
    }

    public static String datePattern(Date date, String pattern) {
        return localDatePattern(getDate(date), pattern);
    }

    private static LocalDate calendarDate(Calendar calendar) {
        return LocalDate.ofInstant(calendar.toInstant(),
                ZoneId.systemDefault());
    }

    public static LocalDate addMonthsCalendar(Calendar calendar, int months) {
        return addMonths(calendarDate(calendar), months);
    }

    public static String calendarDatePattern(Calendar calendar, String pattern) {
        return localDatePattern(calendarDate(calendar), pattern);
    }
}
