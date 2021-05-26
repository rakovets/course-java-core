package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAddDays implements TemporalAdjuster {
    private int addDay;

    public TemporalAddDays(int addDay) {
        this.addDay = addDay;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(this.addDay, ChronoUnit.DAYS);
    }
}
