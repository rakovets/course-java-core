package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper date = new DateWrapper();
        int year = 2022;
        int month = 11;
        int day = 3;
        LocalDate date1 = date.getLocalDate(year, month, day);
        LocalDate date2 = date.getLocalDate(2052, 4, 13);
        System.out.println(date1);
        System.out.println(date.getLocalDateBeforeNMonth(date1,5));
        System.out.println(date.getLocalDateFormatterString(date1, DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.US)));
        System.out.println(date.getStringFormatterLocalDate("11.3.2022","MM.d.yyyy"));
        System.out.println(date.getCountDaysBetweenLocalDates(date1, date2));
    }
}


