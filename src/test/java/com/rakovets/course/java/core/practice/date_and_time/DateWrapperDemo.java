package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper localDate = new DateWrapper();

        LocalDate newLocalDate = localDate.getLocalDate(2022, 8, 7);

        System.out.println(newLocalDate);
        //System.out.println(localDate.getLocalDateWithChangedMonth(newLocalDate, 6));
        System.out.println(newLocalDate.toString());
       System.out.println(localDate.getLocalDateFromPattern(newLocalDate,"yyyy, M, d"));
//        String pattern = "yyyy, MM, d";
//        LocalDate byPattern = LocalDate.parse("2022, 08, 07", DateTimeFormatter.ofPattern(pattern));
//        System.out.println(byPattern);

    }
}
