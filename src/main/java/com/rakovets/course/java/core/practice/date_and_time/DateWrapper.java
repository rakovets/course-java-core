package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class DateWrapper implements TemporalAdjuster {

    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate changeLocalDate(LocalDate localDate, int numberOfMonths) {
        return localDate.plusMonths(numberOfMonths);
    }

    public static String formatDateToString(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate stringFormatToLocalDate(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate;
    }

    public static  long gapeBetweenDatas(LocalDate dateOne, LocalDate dateTwo) {
        long difference;
        if (dateOne.isAfter(dateTwo)) {
            difference = ChronoUnit.DAYS.between(dateTwo, dateOne);
        } else {
            difference = ChronoUnit.DAYS.between(dateOne, dateTwo);
        }
        return difference;
    }

    public Temporal adjustInto(Temporal temporal, int numberOfDays) {
        return temporal.plus(numberOfDays, ChronoUnit.DAYS);

    }


    public Temporal adjustInto(Temporal temporal) {
        Temporal nearestFirstOFJanuary;
        int year = temporal.get(ChronoField.YEAR);
        long period = ChronoUnit.DAYS.between(LocalDate.of(year, 1,1),temporal);
        if (period > Year.of(year).length() / 2) {
            nearestFirstOFJanuary = temporal
                    .with(ChronoField.YEAR,year + 1)
                    .with(ChronoField.MONTH_OF_YEAR, 1)
                    .with(ChronoField.DAY_OF_YEAR, 1);
        } else {
            nearestFirstOFJanuary = temporal
                    .with(ChronoField.MONTH_OF_YEAR, 1)
                    .with(ChronoField.DAY_OF_YEAR, 1);
        }
        return nearestFirstOFJanuary;
    }
}
