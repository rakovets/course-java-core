package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterImplementationOne implements TemporalAdjuster {
    @Override
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
