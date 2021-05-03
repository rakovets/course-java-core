package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate time = DateWrapper.getTime(2020, 2, 11);
        System.out.println(time);
        LocalDate time1 = DateWrapper.getLocalDateFromNMonth(time, 783);
        System.out.println(time1);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        String dateInString = DateWrapper.getLocalDateInString(time, pattern);
        System.out.println(dateInString);
        String stringInDate = "March, 28, 2001";
        LocalDate time2 = DateWrapper.getLocaleDateFromString(stringInDate, pattern);
        System.out.println(time2);
        int countOfDays = DateWrapper.getCountOfDaysBetweenDates(time, time1);
        System.out.printf("%d\n", countOfDays);
        System.out.println(DateWrapper.addDays(time, 123));

    }
}
