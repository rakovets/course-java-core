package com.rakovets.course.java.core.practice.date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.*;


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
}
