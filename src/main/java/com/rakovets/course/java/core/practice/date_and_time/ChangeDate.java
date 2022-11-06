package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeDate implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        int halfYear = 183;
        if (temporal.get(ChronoField.DAY_OF_YEAR) >= halfYear) {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
    }
}
