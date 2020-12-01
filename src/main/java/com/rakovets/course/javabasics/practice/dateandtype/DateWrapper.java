package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public static int getDays(LocalDate localDate1, LocalDate localDate2) {
        return 0;
    }
}
