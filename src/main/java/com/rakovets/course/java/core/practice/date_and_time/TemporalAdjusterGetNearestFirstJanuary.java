package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterGetNearestFirstJanuary implements TemporalAdjuster {
    public TemporalAdjusterGetNearestFirstJanuary() {
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        if (ChronoUnit.DAYS.between(temporal, TemporalAdjusters.firstDayOfNextYear().adjustInto(temporal)) >
                ChronoUnit.DAYS.between(TemporalAdjusters.firstDayOfYear().adjustInto(temporal), temporal)) {
            return TemporalAdjusters.firstDayOfYear().adjustInto(temporal);
        } else {
            return TemporalAdjusters.firstDayOfNextYear().adjustInto(temporal);
        }
    }
}
