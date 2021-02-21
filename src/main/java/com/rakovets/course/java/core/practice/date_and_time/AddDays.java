package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.*;

public class AddDays implements TemporalAdjuster {
    // прибавляет к дате N дней
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(941, ChronoUnit.DAYS);
    }
}
