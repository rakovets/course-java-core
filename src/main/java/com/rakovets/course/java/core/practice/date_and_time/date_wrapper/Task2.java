package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

public class Task2 {
    public static Temporal changesDateFirstDayOfYear(Temporal temporal) {
        final int HALF_NOT_LEAP_YEAR = 365 / 2;
        final int HALF_LEAP_YEAR = 366 / 2;

        int day = temporal.get(ChronoField.DAY_OF_YEAR);
        int halfYear;

        boolean checkLeapYear = temporal.get(ChronoField.YEAR) % 4 == 0;

        if (checkLeapYear) {
            halfYear = HALF_LEAP_YEAR;
        } else {
            halfYear = HALF_NOT_LEAP_YEAR;
        }

        if (day <= halfYear) {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        }
    }
}
