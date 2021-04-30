package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();
        String time = "04-28-21";
        String pattern = "MM-dd-yy";
        System.out.println(DateWrapper.getLocalDate(2021, 4, 27));
        System.out.println(DateWrapper.dateAfterNMonth(LocalDate.now(), 9));
        System.out.println(DateWrapper.dateFormat(LocalDate.now(), pattern));
        System.out.println(DateWrapper.dateFormat(time, pattern));
        System.out.println(DateWrapper.amountDaysBetweenDates(LocalDate.of(2001, 1, 1),
                                                              LocalDate.of(2002, 1, 1)));
        System.out.println(dateWrapper.adjustInto(LocalDate.of(2000, 7, 3)));
        System.out.println(DateWrapper.adjustInto(LocalDate.now(), 100));
    }
}
