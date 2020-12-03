package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateWrapper {
    public LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
    public LocalDate getNextDate(LocalDate localDate, int numberOfMonth) {
        return localDate.plusMonths(numberOfMonth);
    }
    public String getDateFormat(LocalDate localDate, String formatter) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
        return localDate.format(dateTimeFormatter);
    }
    public LocalDate getLocalDate(String date, String formatter) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
            return LocalDate.parse(date, dateTimeFormatter);
    }
    public long getDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }
}
