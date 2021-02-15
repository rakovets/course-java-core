package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public abstract class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int days) {
        return LocalDate.of(year, month, days);
    }

    public static LocalDate getDateAfterMonth(LocalDate now, int month) {
        return now.plusMonths(month);
    }

    public static String formatDateToString(LocalDate now, DateTimeFormatter formatter) {
        return now.format(formatter);
    }

    public static LocalDate parseStringToDate(String string, DateTimeFormatter formatter) {
        return LocalDate.parse(string, formatter);
    }

    public static long getDaysBetweenDates(LocalDate first, LocalDate second) {
        return Math.abs(DAYS.between(first, second));
    }

    public static LocalDate getDateAfterDays (LocalDate date, int days) {
        TemporalAdjuster afterDays = temporal -> temporal.plus(days, DAYS);
        return (LocalDate) afterDays.adjustInto(date);
    }

    public static TemporalAdjuster closestNewYear = temporal ->
            (temporal.get(ChronoField.DAY_OF_YEAR) >= 183)
                    ? temporal.with(TemporalAdjusters.firstDayOfNextYear())
                    : temporal.with(TemporalAdjusters.firstDayOfYear());

    public static Date getDate(int year, int month, int days) throws ParseException {
        String string = days + "." + month + "." + year;
        return new SimpleDateFormat("dd.MM.yyyy").parse(string);
    }

    public static Date getDateAfterMonth(Date date, int month) {
        int monthDate = date.getMonth();
        int yearDate = date.getYear();
        int monthNumber = monthDate + month;

        while (monthNumber > 12) {
            monthNumber -= 12;
            yearDate++;
        }

        date.setMonth(monthNumber);
        date.setYear(yearDate);
        return date;
    }

    public static String formatDateToString(Date date,  SimpleDateFormat formatter) {
        return formatter.format(date);
    }

    public static Date parseStringToDateForDate(String string, SimpleDateFormat formatter) throws ParseException {
        return formatter.parse(string);
    }

    public static long getDaysBetweenDates(Date first, Date second) {
        long difference = Math.abs(first.getTime() - second.getTime());
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
    }

    public static Calendar getCalendar(int year, int month, int days) {
        month = month - 1;
        return new GregorianCalendar(year, month , days);
    }

    public static Calendar getDateAfterMonth(Calendar calendar, int month) {
        calendar.add(Calendar.MONTH, month);
        return calendar;
    }

    public static String formatDateToString(Calendar calendar,  SimpleDateFormat formatter) {
        return formatter.format(calendar.getTime());
    }

    public static Calendar parseStringToDate(String string, SimpleDateFormat formatter) throws ParseException {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(formatter.parse(string));
        return calendar;
    }

    public static long getDaysBetweenDates(Calendar first, Calendar second) {
        long difference = Math.abs(first.getTime().getTime() - second.getTime().getTime());
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
    }
}
