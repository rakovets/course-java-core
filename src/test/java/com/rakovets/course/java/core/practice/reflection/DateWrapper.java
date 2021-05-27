package com.rakovets.course.java.core.practice.reflection;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

public class DateWrapper {
    private String time;
    public static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate addMonths(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    private static LocalDate calendarDate(Calendar calendar) {
        return LocalDate.ofInstant(calendar.toInstant(),
                ZoneId.systemDefault());
    }

    public static LocalDate addMonthsCalendar(Calendar calendar, int months) {
        return addMonths(calendarDate(calendar), months);
    }
}
