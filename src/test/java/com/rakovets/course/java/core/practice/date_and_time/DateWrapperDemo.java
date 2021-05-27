package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dayX = LocalDate.of(2021, 7, 5);

        System.out.println(DateWrapper.returnLocalDate(2021, 4,27));
        System.out.println(DateWrapper.getLocalDateAfterFewMonth(today,5));
        System.out.println(DateWrapper.getStringDatePattern(today, "dd-MM-YYYY"));
        System.out.println(DateWrapper.getLocalDateFormat("20/02/2021", "dd/MM/yyyy"));
        System.out.println(DateWrapper.periodDays(today, dayX));
        System.out.println(new myTemporalAdjusterAddDays(10).adjustInto(today));
        System.out.println(new myTemporalAdjusterNearNewYear().adjustInto(dayX));
    }
}
