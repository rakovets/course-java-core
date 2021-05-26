package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {
    public static void main(String[] args) {
        int numberOfDays = 45;
        TemporalAdjusterImplementationOne temporalAdjusterImplementationOne = new TemporalAdjusterImplementationOne();
        TemporalAdjusterImplementationTwo  temporalAdjusterImplementationTwo = new TemporalAdjusterImplementationTwo(numberOfDays);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M d, yyyy");
        LocalDate dateOne = LocalDate.of(2001, 7,3);
        LocalDate dateTwo = LocalDate.now();
        System.out.println(DateWrapper.getLocalDate(2003,12,3));
        System.out.println(DateWrapper.changeLocalDate(dateOne,4));
        System.out.println(DateWrapper.formatDateToString(dateOne,dateTimeFormatter));
        System.out.println(DateWrapper.stringFormatToLocalDate("2007-12-03"));
        System.out.println(DateWrapper.gapeBetweenDatas(dateTwo,dateOne));
        System.out.println(temporalAdjusterImplementationTwo.adjustInto(dateTwo));
        System.out.println(temporalAdjusterImplementationOne.adjustInto(dateOne));
    }
}
