package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

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

    public LocalDate changeDate(LocalDate localDate, int days) {
        TemporalAdjuster temporalAdjuster = temporal -> temporal.plus(Period.ofDays(days));
        return localDate.with(temporalAdjuster);
    }

    public LocalDate changeDateToNearest1stJanuary(LocalDate localDate) {
        LocalDate firstDayOfTheYear = localDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate firstDayOfTheNextYear = localDate.with(TemporalAdjusters.firstDayOfNextYear());
        TemporalAdjuster temporalAdjuster = temporal -> {
            if (getDaysBetweenDates(localDate, firstDayOfTheNextYear) <
                    (getDaysBetweenDates(firstDayOfTheYear, localDate))) {
                temporal = firstDayOfTheNextYear;
            } else {
                temporal = firstDayOfTheYear;

    }
}
