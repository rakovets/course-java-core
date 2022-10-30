package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateAfterSomeMonth(LocalDate date, int month) {
        return date.plusMonths(month);
    }

    public String getFormattedDate(LocalDate date, DateTimeFormatter dtf) {
        return date.format(dtf);
    }

    public LocalDate getDateFromString(String str, DateTimeFormatter dtf) {
        return LocalDate.parse(str, dtf);
    }

    public long getDaysBetweenDates(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2) ? date1.toEpochDay() - date2.toEpochDay() : date2.toEpochDay() - date1.toEpochDay();
    }
}
