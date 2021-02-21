package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DemoDateAndTime {
    public static void main(String[] args) {
        System.out.println(DateWrapper.getDate(20000, 12,20));
        System.out.println(DateWrapper.getDatePlusMonths(LocalDate.now(), 3));
        System.out.println(DateWrapper.getStringDate(LocalDate.now(), DateTimeFormatter.ofPattern("LL-dd-ee-yy")));
        System.out.println(DateWrapper.getLocalDate("1999/10/17", DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println(DateWrapper.getDifference(LocalDate.now(), LocalDate.of(2021, 01, 01)));
        System.out.println(new AddDaysAdjuster().adjustInto(LocalDate.now()));
        System.out.println(new ChangeDateAdjuster().adjustInto(LocalDate.now()));
    }
}
