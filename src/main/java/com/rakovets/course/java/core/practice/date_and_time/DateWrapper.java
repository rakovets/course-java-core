package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {

    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateBeforeNMonth(LocalDate date, int plusNMonth) {
        return date.plusMonths(plusNMonth);
    }

    public String getLocalDateFormatterString(LocalDate date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    public LocalDate getStringFormatterLocalDate(String date, String formatter) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(formatter));
    }

    public long getCountDaysBetweenLocalDates(LocalDate fromDate, LocalDate toDate) {
        return ChronoUnit.DAYS.between(fromDate, toDate);
    }
}
