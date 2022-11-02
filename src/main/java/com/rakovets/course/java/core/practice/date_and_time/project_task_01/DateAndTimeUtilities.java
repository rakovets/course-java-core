package com.rakovets.course.java.core.practice.date_and_time.project_task_01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.*;

public class DateAndTimeUtilities implements TemporalAdjuster {
    private int daysPlus;

    public DateAndTimeUtilities() {
        this.daysPlus = 0;
    }
    public DateAndTimeUtilities(int daysPlus) {
        this.daysPlus = daysPlus;
    }

    @Override
    public Temporal adjustInto(Temporal localDate) {
        if (daysPlus > 0) {
            return localDate.plus(daysPlus, ChronoUnit.DAYS);
        } else {
            return ChronoUnit.DAYS.between(localDate.with(TemporalAdjusters.firstDayOfNextYear()), localDate)
                    > ChronoUnit.DAYS.between(localDate, localDate.with(TemporalAdjusters.firstDayOfYear()))
                    ? localDate.with(TemporalAdjusters.firstDayOfNextYear())
                    : localDate.with(TemporalAdjusters.firstDayOfYear());
        }
    }

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

    public int getDaysPlus() {
        return daysPlus;
    }

    public void setDaysPlus(int daysPlus) {
        this.daysPlus = daysPlus;
    }
}
