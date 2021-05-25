package com.rakovets.course.java.core.practice.date_and_time.temporal_adjuster_implementations;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ChangeDateToNearestJanuary implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        final int CENTER_OF_LEAP_YEAR= 366 / 2;
        final int CENTER_OF_DEFAULT_YEAR = 365 / 2;
        boolean leapYear = temporal.get(ChronoField.YEAR) % 4 == 0
                && temporal.get(ChronoField.YEAR) % 100 == 0 && temporal.get(ChronoField.YEAR) % 400 == 0;
        int periodDays = (int) ChronoUnit.DAYS.between(temporal,
                LocalDate.of(temporal.get(ChronoField.YEAR) + 1, 1, 1));

        if (leapYear && periodDays <= CENTER_OF_LEAP_YEAR || !leapYear && periodDays < CENTER_OF_DEFAULT_YEAR) {
            temporal = temporal.with(ChronoField.YEAR, temporal.get(ChronoField.YEAR) + 1);
        }
        return temporal
                .with(ChronoField.MONTH_OF_YEAR, 1)
                .with(ChronoField.DAY_OF_MONTH, 1);
    }
}
