package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class dateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();

        System.out.println(DateWrapper.dMY(1,2,3));
        System.out.println(DateWrapper.monthLocal(LocalDate.now(),10));
        System.out.println(DateWrapper.patternOfDate(LocalDate.now(),"MM.dd.YY"));
        System.out.println(DateWrapper.stringPattern("04-28-21","MM-dd-yy"));
        System.out.println(DateWrapper.daysBetweenDates(LocalDate.of(2002,12,1),LocalDate.of(2001,1,1)));
        System.out.println(DateWrapper.addDays(LocalDate.now(),22));
        System.out.println(DateWrapper.closerToJan(LocalDate.of(2021,7,2)));
    }
}
