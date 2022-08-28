package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateWrapper {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDatePlusMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public String getStringFromPattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public LocalDate getLocalDateFromPattern(String pattern, String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    public int getCountOfDifferenceBetweenLocalDates(LocalDate fromLocalDate, LocalDate toLocalDate) {
        return Period.between(fromLocalDate, toLocalDate).getDays();
    }
}
