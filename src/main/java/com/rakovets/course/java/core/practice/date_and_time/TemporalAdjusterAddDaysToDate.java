package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterAddDaysToDate implements TemporalAdjuster {
    private int daysToAdd;

    public TemporalAdjusterAddDaysToDate(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(daysToAdd, ChronoUnit.DAYS);
    }
}
