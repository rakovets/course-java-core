package com.rakovets.course.java.core.practice.date_and_time.project_task_01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DateAndTimeUtilities {
    public LocalDate getLocalDate(int year, int months, int day) throws DateTimeException {
        return LocalDate.of(year, months, day);
    }

    public LocalDate getLocalDatePlusNMonths(LocalDate localDate, int numberOfMonthsToAdd) {
        return localDate.plusMonths(numberOfMonthsToAdd);
    }

    public String getDateFormatted(LocalDate localDate, DateTimeFormatter formatter) throws UnsupportedTemporalTypeException, IllegalArgumentException {
        return localDate.format(formatter);
    }

    public LocalDate getLocalDateByStringAndFormatter(String localDateFormattedString, DateTimeFormatter formatter) throws DateTimeParseException {
        return LocalDate.parse(localDateFormattedString, formatter);
    }

    public Period getPeriodBetweenTwoLocaleDate(LocalDate localDateEarlier, LocalDate localDateLater) {
        return Period.between(localDateEarlier, localDateLater);
    }
}
