package com.rakovets.course.java.core.practice.date_and_time;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateWrapper {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDateWithChangedMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public String getLocalDateFromPattern(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }
}
