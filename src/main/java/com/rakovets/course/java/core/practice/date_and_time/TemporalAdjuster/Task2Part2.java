package com.rakovets.course.java.core.practice.date_and_time.TemporalAdjuster;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2Part2 implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal firstDayOfYear = temporal.with(TemporalAdjusters.firstDayOfYear());
        Temporal firstDayOfNextYear = temporal.with(TemporalAdjusters.firstDayOfNextYear());
        long daysBetweenThisFirstDayAndTemporal = ChronoUnit.DAYS.between(firstDayOfYear, temporal);
        long daysBetweenNextFirstDayAndTemporal = ChronoUnit.DAYS.between(temporal, firstDayOfNextYear);
        return daysBetweenThisFirstDayAndTemporal > daysBetweenNextFirstDayAndTemporal ? firstDayOfNextYear : firstDayOfYear;
    }
}
