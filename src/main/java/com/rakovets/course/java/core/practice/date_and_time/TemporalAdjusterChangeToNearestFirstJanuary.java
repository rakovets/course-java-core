package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterChangeToNearestFirstJanuary implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal firstJanuaryThisYear = TemporalAdjusters.firstDayOfYear().adjustInto(temporal);
        Temporal firstJanuaryNextYear = TemporalAdjusters.firstDayOfNextYear().adjustInto(temporal);
        return ChronoUnit.DAYS.between(firstJanuaryThisYear, temporal) <
                ChronoUnit.DAYS.between(temporal, firstJanuaryNextYear) ?
                firstJanuaryThisYear :
                firstJanuaryNextYear;
    }
}
