package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateWrapper {
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getLocalDatePlusMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public static String getStringDate(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate getLocalDateFromString(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date,formatter);
    }

    public static Period getPeriodBetweenLocalDate(LocalDate localDate1, LocalDate localDate2) {
        return Period.between(localDate1,localDate2);
    }


}
