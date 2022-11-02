package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {
    public LocalDate yearMonthDay(int year, Month month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate addMonth(LocalDate yearMonthDay, int monthsAmount) {
        return yearMonthDay.plusMonths(monthsAmount);
    }

    public String formatLocalDateWithString(LocalDate yearMonthDay, DateTimeFormatter formatter) {
        return yearMonthDay.format(formatter);
    }

    public LocalDate formatLocalDateWithLocalDate(String localDate, DateTimeFormatter formatter) {
        return LocalDate.parse(localDate, formatter);
    }

    public Period dayAmountBetweenTwoDates(LocalDate firstDate, LocalDate secondDate) {
        return Period.between(firstDate, secondDate);
    }

    public long countDaysBetweenTwoDates(LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}
