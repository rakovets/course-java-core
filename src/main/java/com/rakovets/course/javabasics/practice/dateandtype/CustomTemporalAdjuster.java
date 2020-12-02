package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class CustomTemporalAdjuster implements TemporalAdjuster {
    private int daysToAdd;

    public CustomTemporalAdjuster(int daysToAdd) {
        this.daysToAdd = daysToAdd;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
         int daysToAdd = this.daysToAdd;
    return temporal.plus(daysToAdd, ChronoUnit.DAYS);
    }
}
