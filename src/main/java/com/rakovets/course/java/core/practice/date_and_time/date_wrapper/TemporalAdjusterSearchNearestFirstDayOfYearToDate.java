package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterSearchNearestFirstDayOfYearToDate implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return ChronoUnit.DAYS.between(TemporalAdjusters.firstDayOfYear().adjustInto(temporal), temporal) <
                ChronoUnit.DAYS.between(temporal, TemporalAdjusters.lastDayOfYear().adjustInto(temporal))
                ? TemporalAdjusters.firstDayOfYear().adjustInto(temporal)
                : TemporalAdjusters.firstDayOfNextYear().adjustInto(temporal);
    }
}
