package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ClosestFirstDayOfYearAdjuster implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal firstDayOfYear = temporal.with(TemporalAdjusters.firstDayOfYear());
        Temporal firstDayOfNextYear = temporal.with(TemporalAdjusters.firstDayOfNextYear());
        long daysToFirstDayThisYear = ChronoUnit.DAYS.between(firstDayOfYear, temporal);
        long daysToFirstDayNextYear = ChronoUnit.DAYS.between(temporal, firstDayOfNextYear);
        return daysToFirstDayThisYear < daysToFirstDayNextYear ? firstDayOfYear : firstDayOfNextYear;
    }
}
