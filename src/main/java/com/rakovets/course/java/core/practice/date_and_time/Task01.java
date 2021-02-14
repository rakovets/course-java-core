package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task01 {
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
}
