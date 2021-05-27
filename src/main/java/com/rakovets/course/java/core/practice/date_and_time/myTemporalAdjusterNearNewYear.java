package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.*;

public class myTemporalAdjusterNearNewYear implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        final int HALF_OF_YEAR = 183;

        if (temporal.get(ChronoField.DAY_OF_YEAR) > HALF_OF_YEAR) {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
    }
}
