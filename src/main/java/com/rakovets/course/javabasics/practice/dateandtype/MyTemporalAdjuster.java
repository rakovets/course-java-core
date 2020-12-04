package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class MyTemporalAdjuster implements TemporalAdjuster {
    private int days;

    public MyTemporalAdjuster (int days) {
        this.days = days;
    }
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(days, ChronoUnit.DAYS);
    }
}
