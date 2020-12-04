package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;


public class DateWrapper {
    public LocalDate buildLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate changeLocalDate(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public String buildLocalPattern(LocalDate localDate, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return localDate.format(formatter);
    }

    public LocalDate buildLocalString(String pattern, String locDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return LocalDate.parse(locDate, formatter);
    }

    public long getDifferenceLocalDate(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate2, localDate1);
    }

    public TemporalAdjuster getSumDate(LocalDate localDate, int day) {
        TemporalAdjuster temporalAdjuster = t -> t.plus(Period.ofDays(day));
        return localDate.with(temporalAdjuster);
    }

    public LocalDate getJanuaryYear(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        int month = localDate.getMonthValue();
        if (month <= 6) {
            return localDate2;
        } else {
            return localDate3;
        }
    }
}
