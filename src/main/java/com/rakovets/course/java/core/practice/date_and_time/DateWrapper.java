package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

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

    public static Temporal adjustInto(Temporal temporal, int days) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }

    public static Temporal adjustInto(Temporal temporal) {
        final int HALF_YEAR = 365 / 2;
        final int HALF_LEAP_YEAR = 366 / 2;

        int day = temporal.get(ChronoField.DAY_OF_YEAR);
        int middleYear;

        boolean leapYear = temporal.get(ChronoField.YEAR) % 4 == 0;

        if (leapYear == true) {
            middleYear = HALF_LEAP_YEAR;
        } else {
            middleYear = HALF_YEAR;
        }

        if (day <= middleYear) {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        }
    }
}
