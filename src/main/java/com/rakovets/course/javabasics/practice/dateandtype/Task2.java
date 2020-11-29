package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task2 implements TemporalAdjuster {

    private LocalDate date ;

    protected Task2(LocalDate date) {
        this.date = date;
    }
    public void addDaysToDate(int days) {
        TemporalAdjuster temporalAdjuster = t -> t.plus(Period.ofDays(days));
        this.date = date.with(temporalAdjuster);
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return null;
    }
}
