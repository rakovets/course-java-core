package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class Task02 {
    public LocalDate addDaysToLocalDate(LocalDate localDate, long days) {
        return localDate.plusDays(days);
    }

    public LocalDate changeLocalDateToJanuary(LocalDate localDate) {
        int currentDayInYear = localDate.getDayOfYear();
        int middleOfTheYear = 365 / 2;
        LocalDate localDateToJanuary;

        if (currentDayInYear > middleOfTheYear) {
            localDateToJanuary = LocalDate.of(localDate.getYear() + 1, 1, 1);
        } else {
            localDateToJanuary = LocalDate.of(localDate.getYear(), 1, 1);
        }
        return localDateToJanuary;
    }
}
