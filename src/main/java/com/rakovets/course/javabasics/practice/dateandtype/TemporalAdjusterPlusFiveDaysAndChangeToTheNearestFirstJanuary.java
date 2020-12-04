package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterPlusFiveDaysAndChangeToTheNearestFirstJanuary implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        int daysToAdd = 5;
        LocalDate localDate = LocalDate.from(temporal.plus(daysToAdd, ChronoUnit.DAYS));
        int years = localDate.getYear();
        int months = localDate.getMonthValue();
        if (months >= 6) {
            years = years + 1;

        }
        return LocalDate.of(years, 1, 1);
    }
}
