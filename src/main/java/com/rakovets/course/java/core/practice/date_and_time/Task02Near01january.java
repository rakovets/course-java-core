package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.temporal.*;

public class Task02Near01january implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        if (temporal.get(ChronoField.DAY_OF_YEAR) >= 183) {
           return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        } else {
           return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
    }
}
