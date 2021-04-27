package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class dateWrapperDemo {
    public static void main(String[] args) {
        System.out.println(DateWrapper.dMY(1,2,3));
        System.out.println(DateWrapper.monthLocal(LocalDate.now(),10));
        System.out.println(DateWrapper.patternOfDate(LocalDate.now(),"MM, dd, yy"));
    }
}
