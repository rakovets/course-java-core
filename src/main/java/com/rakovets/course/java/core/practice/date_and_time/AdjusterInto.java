package com.rakovets.course.java.core.practice.date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class AdjusterInto {

    public static LocalDate getDateAfterDays (LocalDate date, int days) {
        TemporalAdjuster afterDays = temporal -> temporal.plus(days, DAYS);
        return (LocalDate) afterDays.adjustInto(date);
    }

    public static TemporalAdjuster closestNewYear = temporal ->
            (temporal.get(ChronoField.DAY_OF_YEAR) >= (temporal.range(ChronoField.DAY_OF_YEAR).getMaximum() / 2))
                    ? temporal.with(TemporalAdjusters.firstDayOfNextYear())
                    : temporal.with(TemporalAdjusters.firstDayOfYear());

    public static Date getDate(int year, int month, int days) throws ParseException {
        String string = days + "." + month + "." + year;
        return new SimpleDateFormat("dd.MM.yyyy").parse(string);
    }
}
