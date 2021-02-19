package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class CustomTemporal implements TemporalAdjuster {

    // прибавляет к дате N дней
    public static TemporalAdjuster addDays(LocalDate ld, long days) {
        return ld.plusDays(days);
    }
    // изменяет дату на ближайшее (в днях) 1 января
    @Override
    public Temporal adjustInto(Temporal temporal) {
        int halfOfYear = 183;
        if (temporal.get(ChronoField.DAY_OF_YEAR) > halfOfYear) {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
    }
}
