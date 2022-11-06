package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.*;

public class AddDays implements TemporalAdjuster {
    private int countDays;

    public AddDays(int countDays) {
        this.countDays = countDays;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(countDays, ChronoUnit.DAYS);
    }
}
