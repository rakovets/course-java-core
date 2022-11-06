package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateWrapper {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateAfterAddMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public String getLocalDatePattern(LocalDate localDate, DateTimeFormatter format) {
        return localDate.format(format);
    }

    public LocalDate getLocalDateFormat(String localDate, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format, Locale.US);
        return LocalDate.parse(localDate, dateTimeFormatter);
    }

    public long getCountDaysBetweenDate(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
