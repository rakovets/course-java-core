package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate changeLocalDate(LocalDate localDate, int numberOfMonths) {
        return localDate.plusMonths(numberOfMonths);
    }

    public static String formatDateToString(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate stringFormatToLocalDate(String date) {
        return LocalDate.parse(date);
    }

    public static  long gapeBetweenDatas(LocalDate dateOne, LocalDate dateTwo) {
        long difference;
        if (dateOne.isAfter(dateTwo)) {
            difference = ChronoUnit.DAYS.between(dateTwo, dateOne);
        } else {
            difference = ChronoUnit.DAYS.between(dateOne, dateTwo);
        }
        return difference;
    }
}
