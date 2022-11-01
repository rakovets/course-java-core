package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task02_2 implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal localDate) {
        Temporal firstDayThisYear = localDate.with(TemporalAdjusters.firstDayOfYear());
        Temporal firstDayNextYear = localDate.with(TemporalAdjusters.firstDayOfNextYear());
        long daysBetweenThisYear = ChronoUnit.DAYS.between(firstDayThisYear, localDate);
        long daysBetweenNextYear = ChronoUnit.DAYS.between(localDate, firstDayNextYear);
        return daysBetweenThisYear < daysBetweenNextYear ? firstDayThisYear : firstDayNextYear;
    }
}
