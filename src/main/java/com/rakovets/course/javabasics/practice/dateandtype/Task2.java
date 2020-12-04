package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;

public class Task2 implements TemporalAdjuster {

    private int countDays;

    protected Task2() {
    }

    public Temporal adjustIntoPlusDays(Temporal temporal, int days) {
        this.countDays = days;
        return this.adjustInto(temporal);
    }

    public Temporal adjustIntoNewYear(LocalDate temporal) {
        LocalDate currentYear = LocalDate.of(temporal.getYear(), 1, 1);
        LocalDate nextYear = LocalDate.of(temporal.getYear() + 1, 1, 1);

        int diffWithCurrentYear = (int) LocalDate.of(temporal.getYear(), temporal.getMonth(), temporal.getDayOfMonth()).until(currentYear, ChronoUnit.DAYS);
        int diffWithNextYear = (int) LocalDate.of(temporal.getYear(), temporal.getMonth(), temporal.getDayOfMonth()).until(nextYear, ChronoUnit.DAYS);

        return Math.abs(diffWithNextYear) > Math.abs(diffWithCurrentYear)
                ? this.adjustIntoPlusDays(temporal, diffWithCurrentYear)
                : this.adjustIntoPlusDays(temporal, diffWithNextYear);
    }

    @Override
    public Temporal adjustInto(Temporal temporal) {
        temporal = temporal.plus(Period.ofDays(this.countDays));
        return temporal;
    }
}
