package com.rakovets.course.java.core.practice.date_and_time.temporal_adjuster_implementations;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class AddDaysToDate implements TemporalAdjuster {
    private final int days;

    public AddDaysToDate(int days) {
        this.days = days;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }
}
