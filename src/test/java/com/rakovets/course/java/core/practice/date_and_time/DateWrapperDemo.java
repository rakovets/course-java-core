package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapperDemo {
    public static void main(String[] args) {
        System.out.println(DateWrapper.returnLocalDate(2021,04,27));
        LocalDate today = LocalDate.now();
        LocalDate dayX = LocalDate.of(2021, 07, 02);
        System.out.println(DateWrapper.afterFewMonth(today,5));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M.d.yy");
        System.out.println(DateWrapper.formalLocalDate(today, dateTimeFormatter));
        System.out.println(DateWrapper.localDate("12.02.21", dateTimeFormatter));
        System.out.println(DateWrapper.periodDays(today, dayX));
        System.out.println(DateWrapper.addDaysToDate(today, 60));
        System.out.println(DateWrapper.changeDateNearestBeginningYear(dayX));
    }
}
