package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class Task2 {
    public LocalDate getDatePlusDays(LocalDate date, int days) {
        return LocalDate.ofEpochDay(date.toEpochDay() + days);
    }

    public LocalDate getNearestFirstJanuary(LocalDate date) {
        int thisYear = date.getYear();
        int nextYear = thisYear + 1;
        return date.getDayOfYear() > 365 / 2 ? LocalDate.of(nextYear, 1, 1) : LocalDate.of(thisYear, 1, 1);
    }
}
