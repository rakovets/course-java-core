package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterDaysAddDate implements TemporalAdjuster {
    private int numberDays;

    public TemporalAdjusterDaysAddDate(int numberDays) {
        this.numberDays = numberDays;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(numberDays, ChronoUnit.DAYS);
    }
}
