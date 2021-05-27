package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterImplementationTwo implements TemporalAdjuster {
    int numberOfDays;

    public TemporalAdjusterImplementationTwo(int numberOfDays){
        this.numberOfDays = numberOfDays;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(numberOfDays, ChronoUnit.DAYS);
    }
}
