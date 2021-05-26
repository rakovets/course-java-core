package com.rakovets.course.java.core.practice.date_and_time;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TaskTemporalAdjuster2 implements TemporalAdjuster {
    private static boolean leapYear;
    private static int middleYear;
    private static int day;
    private static final int HALF_YEAR = 365 / 2;
    private static final int HALF_LEAP_YEAR = 366 / 2;

    @Override
    public Temporal adjustInto(Temporal temporal) {
        leapYear = temporal.get(ChronoField.YEAR) % 4 == 0;
        day = temporal.get(ChronoField.DAY_OF_YEAR);

        if (leapYear == true) {
            middleYear = HALF_LEAP_YEAR;
        } else {
            middleYear = HALF_YEAR;
        }
        if (day <= middleYear) {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        }
    }
}
