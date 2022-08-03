package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataWrapper {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateInXMonths(LocalDate localDate, int amountOfMonths) {
        return localDate.plusMonths(amountOfMonths);
    }

    public String getLocalDatePattern(LocalDate localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDate.format(dateTimeFormatter);
    }

    public LocalDate getLocalDatePattern(String string, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(string, dateTimeFormatter);
    }

    public int getAmountOfMonthBetweenTwoDates(LocalDate localDateFirst, LocalDate localDateSecond) {
        Period period = Period.between(localDateFirst, localDateSecond);
        return period.getMonths();
    }
}
