package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year,month, day);
    }

    public static LocalDate getLocalDateWithChangedMonth(LocalDate date, int month) {
        return date.plusMonths(month);
    }

    public static String getStringWithDate(LocalDate date, DateTimeFormatter pattern) {
        return date.format(pattern);
    }

    public static LocalDate makeLocalDateFromString(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    public static int getNumberDayBetweenTwoDates(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period.getDays();
    }

    public static Temporal adjustInto(Temporal temporal, int days) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }

     public static Temporal adjustInto(Temporal date) {
        int year = date.get(ChronoField.YEAR);
        int day = date.get(ChronoField.DAY_OF_YEAR);

        final int MIDDLE_OF_NON_LEAP_YEAR = 366/2;
        final int MIDDLE_OF_LEAP_YEAR = 265/2;
        int middleOfLeapYear;

        boolean leapYear;
        if (year % 4 != 0) {
            leapYear = false;
        } else if (year % 100 != 0) {
            leapYear = false;
        } else if (year % 400 != 0) {
            leapYear = false;
        } else {
            leapYear = true;
        }

        if (leapYear) {
            middleOfLeapYear = MIDDLE_OF_LEAP_YEAR;
        } else {
            middleOfLeapYear = MIDDLE_OF_NON_LEAP_YEAR;
        }

        if (day <= middleOfLeapYear) {
            return date.with(ChronoField.MONTH_OF_YEAR, 1).with(ChronoField.DAY_OF_MONTH, 1);
        } else {
            return date.with(ChronoField.YEAR, (year + 1)).with(ChronoField.MONTH_OF_YEAR, 1).with(ChronoField.DAY_OF_MONTH, 1);
        }
    }
}

