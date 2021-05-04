package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.time.LocalDate;

public class DateWrapperDemo {
        public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();
        String date = "11-01-20";
        String pattern = "dd-MM-yy";
        System.out.println(DateWrapper.getLocalDate(2020, 1, 11));
        System.out.println(DateWrapper.getDateAfterQuantityNMonth(LocalDate.now(), 5));
        System.out.println(DateWrapper.getDateFormatPattern(LocalDate.now(), pattern));
        System.out.println(DateWrapper.getLocalDateFormatPattern(date, pattern));
        System.out.println(DateWrapper.getQuantityDaysBetweenDates(LocalDate.of(2010, 11, 11),
                LocalDate.of(2020, 11, 1)));
        System.out.println(DateWrapper.addNDays(LocalDate.now(),3));
        }
}
