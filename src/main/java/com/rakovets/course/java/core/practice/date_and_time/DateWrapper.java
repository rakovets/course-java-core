package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {

    public static LocalDate returnLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate afterFewMonth(LocalDate localDate, int month) {
        return LocalDate.of(localDate.getYear(), localDate.plusMonths(month).getMonth(), localDate.getDayOfMonth());
    }

    public static String formalLocalDate(LocalDate localDate, DateTimeFormatter dateTimeFormatter) {
        return localDate.format(dateTimeFormatter);
    }

    public static LocalDate localDate(String string, DateTimeFormatter dateTimeFormatter) {
        return LocalDate.parse(string, dateTimeFormatter);
    }

    public static long periodDays(LocalDate firstLocalDate, LocalDate secondLocalDate) {
        return ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate);
    }

    public static LocalDate addDaysToDate(LocalDate localDate, int numberDays) {
        return localDate.plusDays(numberDays);
    }

    public static LocalDate changeDateNearestBeginningYear(LocalDate localDate) {
        final int HALF_OF_YEAR = 365 / 2;
        final int HALF_OF_LEAP_YEAR = 366 / 2;
        int day = localDate.getDayOfYear();

        if (LeapYear.isLeapYear(localDate.getYear()) && day <= HALF_OF_LEAP_YEAR ||
                !LeapYear.isLeapYear(localDate.getYear()) && day <= HALF_OF_YEAR) {
            return LocalDate.of(localDate.getYear(),
                    localDate.withMonth(1).getMonth(),
                    localDate.withDayOfMonth(1).getDayOfMonth());
        } else {
            return LocalDate.of(localDate.plusYears(1).getYear(),
                    localDate.withMonth(1).getMonth(),
                    localDate.withDayOfMonth(1).getDayOfMonth());
        }
    }
}
