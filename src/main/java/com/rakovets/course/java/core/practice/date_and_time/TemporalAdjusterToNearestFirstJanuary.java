package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterToNearestFirstJanuary implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal firstDayOfNextYear = TemporalAdjusters.firstDayOfNextYear().adjustInto(temporal);
        Temporal firstDayOfCurrentYear=TemporalAdjusters.firstDayOfYear().adjustInto(temporal);
        return (ChronoUnit.DAYS.between(temporal, firstDayOfNextYear) >
                ChronoUnit.DAYS.between(firstDayOfCurrentYear, temporal))
                ? firstDayOfCurrentYear
                : firstDayOfNextYear;
    }
}
