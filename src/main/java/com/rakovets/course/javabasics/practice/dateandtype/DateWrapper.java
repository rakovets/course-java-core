package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public static LocalDate getLocalDateAfter(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String getLocalDateOfFormat(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern, US));
    }

    public static String getLocalDateOfFormat(String date, String pattern) {
        return LocalDate.parse(date).format(DateTimeFormatter.ofPattern(pattern, US));
    }

    public static long getDays(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static TemporalAdjuster plusDays(int n) {
        return temporal -> temporal.plus(Period.ofDays(n));
    }

    public static TemporalAdjuster nearestFirstDayOfYear() {
         return temporal ->
                ChronoUnit.DAYS.between(
                        temporal.with(TemporalAdjusters.firstDayOfYear()),
                        temporal
                ) < ChronoUnit.DAYS.between(
                        temporal,
                        temporal.with(TemporalAdjusters.firstDayOfNextYear())
                ) ? temporal.with(TemporalAdjusters.firstDayOfYear()) :
                        temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }

    private static LocalDate dateToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalDate getLocalDateAfter(Date date, int months) {
        return getLocalDateAfter(dateToLocalDate(date), months);
    }

    public static String getLocalDateOfFormat(Date date, String pattern) {
        return getLocalDateOfFormat(dateToLocalDate(date), pattern);
    }

    private static LocalDate calendarToLocalDate(Calendar calendar) {
        return  LocalDateTime.ofInstant(calendar.toInstant(),
                calendar.getTimeZone().toZoneId())
                .toLocalDate();
    }

    public static LocalDate getLocalDateAfter(Calendar calendar, int months) {
        return getLocalDateAfter(calendarToLocalDate(calendar), months);
    }

    public static String getLocalDateOfFormat(Calendar calendar, String pattern) {
        return getLocalDateOfFormat(calendarToLocalDate(calendar), pattern);
    }
}
