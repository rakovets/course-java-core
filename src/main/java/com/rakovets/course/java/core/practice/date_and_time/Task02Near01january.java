package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.temporal.*;

public class Task02Near01january implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {

        LocalDate local1 = LocalDate.from((TemporalAccessor) TemporalAdjusters.firstDayOfYear());
        LocalDate local2 = LocalDate.from((TemporalAccessor) TemporalAdjusters.firstDayOfNextYear());
        if (Period.between(LocalDate.from(temporal), local1).getDays() >= Period.between(LocalDate.from(temporal), local2).getDays()) {
            return (Temporal)TemporalAdjusters.firstDayOfNextYear();
        } else {
            return (Temporal)TemporalAdjusters.firstDayOfYear();
        }
    }
}
