package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task1 implements TemporalAdjuster {
    private static int days;

    public Task1(int days) {
        this.days = days;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(this.days, ChronoUnit.DAYS);
    }
}
