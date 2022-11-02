package com.rakovets.course.java.core.practice.date_and_time.TemporalAdjuster;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task2 implements TemporalAdjuster {
    private int days;

    public Task2(int days) {
        this.days = days;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }
}
