package com.rakovets.course.java.core.practice.date_and_time.specification_task02;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class AddDays implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(7, ChronoUnit.DAYS);
    }
}
