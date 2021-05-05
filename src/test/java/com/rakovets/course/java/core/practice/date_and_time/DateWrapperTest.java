package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperTest {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();
        System.out.println(DateWrapper.localDate(2014,12,23));
        System.out.println(DateWrapper.addToLocalDate(DateWrapper.localDate(2014,12,20),25));
        System.out.println(DateWrapper.patternLocalDate(DateWrapper.localDate(2014,12,23),"dd-MM-YYYY"));
        System.out.println(DateWrapper.patternLocalDateString("19/05/2009", "dd/MM/yyyy"));
        System.out.println(DateWrapper.differenceLocalDate(DateWrapper.localDate(2014,12,26),
                DateWrapper.localDate(2014,12,20)));
        System.out.println(dateWrapper.adjustInto(LocalDate.now(),10));
        System.out.println(dateWrapper.adjustInto(LocalDate.now()));
    }
}
