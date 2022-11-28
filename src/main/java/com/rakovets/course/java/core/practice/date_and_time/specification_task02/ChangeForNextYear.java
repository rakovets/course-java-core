package com.rakovets.course.java.core.practice.date_and_time.specification_task02;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ChangeForNextYear implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate localDate = LocalDate.now();
        return temporal.with(ChronoField.MONTH_OF_YEAR, 1)
                .with(ChronoField.DAY_OF_MONTH, 1)
                .with(ChronoField.YEAR, localDate.getYear() + 1);
    }
}
