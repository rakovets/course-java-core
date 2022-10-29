package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateWrapperTask01 {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getShiftByMonth(LocalDate date, int shiftMonth) {
        return date.plusMonths(shiftMonth);
    }

    public String getStringDateChangeByPattern(LocalDate date, DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    public LocalDate getLocalDateChangeByPattern(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter.localizedBy(Locale.US));
    }

    public int getTimeBetweenDates(LocalDate dateStart, LocalDate dateEnd) {
        return (int) ChronoUnit.DAYS.between(dateStart, dateEnd);
    }
}
