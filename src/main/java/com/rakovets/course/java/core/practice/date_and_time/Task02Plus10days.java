package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task02Plus10days implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(10, ChronoUnit.DAYS);
    }
}
