package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class DateWrapper {
    public LocalDate getLocalDate(Integer year, Integer month, Integer day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateAfterSeveralMonth(LocalDate now, Integer severalMonth) {
        return now.plusMonths(severalMonth);
    }

    public String getFormatPattern(LocalDate localDate, DateTimeFormatter formatter){
        return localDate.format(formatter);
    }

    public LocalDate getStringFormat(String time, DateTimeFormatter formatter){
        return LocalDate.parse(time, formatter);
    }

    public int getAmountDay(LocalDate localDate, LocalDate localDate1){
        return Math.toIntExact(DAYS.between(localDate, localDate1));
    }
}
