package com.rakovets.course.java.core.practice.date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getDatePlusNumberOfMonth(LocalDate local, int numberOfMonth) {
        return  local.plusMonths(numberOfMonth);
    }

    public static String getStringOfPattern(LocalDate local, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return local.format(formatter);
    }

    public static LocalDate getLocalDateOfPattern(String str, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(str, formatter);
    }

    public static int getDays(LocalDate local1, LocalDate local2) {
        return Period.between(local1, local2).getDays();
    }

    public static Date getDate(int year, int month, int days) throws ParseException {
        String string = days + "." + month + "." + year;
        return new SimpleDateFormat("dd.MM.yyyy").parse(string);
    }

    public static String getStringOfPattern(Date date,  SimpleDateFormat formatter) {
        return formatter.format(date);
    }

    public static Date getLocalDateOfPattern(String string, SimpleDateFormat formatter) throws ParseException {
        return formatter.parse(string);
    }

    public static long getDays(Date first, Date second) {
        long difference = Math.abs(first.getTime() - second.getTime());
        return TimeUnit.DAYS.convert(difference, TimeUnit.DAYS);
    }

    public static Calendar getDatePlusNumberOfMonth(Calendar calendar, int month) {
        calendar.add(Calendar.MONTH, month);
        return calendar;
    }

    public static String getStringOfPattern(Calendar calendar,  SimpleDateFormat formatter) {
        return formatter.format(calendar.getTime());
    }

    public static Calendar getLocalDate0fPattern(String string, SimpleDateFormat formatter) throws ParseException {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(formatter.parse(string));
        return calendar;
    }

    public static long getDays(Calendar first, Calendar second) {
        long difference = Math.abs(first.getTime().getTime() - second.getTime().getTime());
        return TimeUnit.DAYS.convert(difference, TimeUnit.DAYS);
    }
}
