package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

public class Task02 {
    public Temporal daysAddDate(LocalDate date, int numberDays) {
        return date.plusDays(numberDays);
    }

    public Temporal searchNearestFirstDayOfYearToDate(LocalDate date) {
        return ChronoUnit.DAYS.between(TemporalAdjusters.firstDayOfYear().adjustInto(date), date) <
                ChronoUnit.DAYS.between(date, TemporalAdjusters.lastDayOfYear().adjustInto(date))
                ? TemporalAdjusters.firstDayOfYear().adjustInto(date)
                : TemporalAdjusters.firstDayOfNextYear().adjustInto(date);
    }
}
