package com.rakovets.course.javabasics.practice.dateandtype;

import com.rakovets.course.javabasics.example.dateandtime.localdatetime.LocalDateTimeExample3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TempAdj implements TemporalAdjuster {

    private int days;


    public TempAdj(int days) {
        this.days = days;
    }

    @Override
    public LocalDate adjustInto(Temporal temporal) {
        TemporalAdjuster temporalAdjuster = t -> t.plus(Period.ofDays(days));
        return (LocalDate) temporal.with(temporalAdjuster);
    }
}
