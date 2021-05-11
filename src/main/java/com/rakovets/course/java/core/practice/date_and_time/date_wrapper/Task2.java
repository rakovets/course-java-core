package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static TemporalAdjuster getTemporalAdjusterAddDays(int days) {
        return temporal -> temporal.plus(Period.ofDays(days));
    }

    public static TemporalAdjuster getNearFirstJenuary(LocalDate localDate) {
        int days = localDate.getDayOfYear();
        if (days <= 183) {
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return temporal -> temporal.with(TemporalAdjusters.firstDayOfNextYear());
        }
    }
}
