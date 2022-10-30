package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task02_2 implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return (Temporal) TemporalAdjusters.firstDayOfNextYear();
    }
}
