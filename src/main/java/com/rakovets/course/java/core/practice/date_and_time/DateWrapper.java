package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapper {

    public static LocalDate dMY(int year,int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static LocalDate monthLocal(LocalDate date, int amountmonth){
        return date.plusMonths(amountmonth);
    }

    public static String patternOfDate(LocalDate date, String pattern){
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
