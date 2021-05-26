package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalNearNewYear implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return ChronoUnit.DAYS.between(
                temporal.with(TemporalAdjusters.firstDayOfYear()),
                temporal
        ) >= ChronoUnit.DAYS.between(
                temporal,
                temporal.with(TemporalAdjusters.firstDayOfNextYear())
        ) ? temporal.with(TemporalAdjusters.firstDayOfNextYear()) :
                temporal.with(TemporalAdjusters.firstDayOfYear());
    }
}
