package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper localDate = new DateWrapper();

        LocalDate newLocalDate = localDate.getLocalDate(2022, 8, 7);

        System.out.println(newLocalDate);
        //System.out.println(localDate.getLocalDateWithChangedMonth(newLocalDate, 6));
        System.out.println(newLocalDate.toString());
       System.out.println(localDate.getStringDateFromPattern(newLocalDate,"yyyy, M, d"));
        System.out.println(localDate.getLocalDateFromPattern("04+28+20","MM+dd+yy"));
//        String pattern = "yyyy, MM, d";
//        LocalDate byPattern = LocalDate.parse("2022, 08, 07", DateTimeFormatter.ofPattern(pattern));
        System.out.println("---------------------");

        LocalDate march2003 = LocalDate.of(2000, 3, 1);
        LocalDate may2003 = LocalDate.of(2001, 5, 10);
        Period dif = Period.between(march2003, may2003);
        System.out.println(dif.get(ChronoUnit.DAYS));

        System.out.println(localDate.getDifferenceInDaysBetweenLocalDates(march2003, may2003));

    }
}
