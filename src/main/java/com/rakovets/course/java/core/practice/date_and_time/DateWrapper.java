package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int mount, int day) {
        return LocalDate.of(year, mount, day);
    }

    public static LocalDate getLocalDateAfterPlusMount(LocalDate dateTime, int mount) {
        return dateTime.plusMonths(mount);
    }

    public static String getStringDateTime(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate getLocalDateFromString(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    public static long getDaysBetween(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static TemporalAdjuster getAddDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }

}
