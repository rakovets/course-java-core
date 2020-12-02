package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate date = DateWrapper.getLocalDate(2000, 03, 07);
        System.out.println(date);
        LocalDate date1 = DateWrapper.getNewLocalDate(date, 2);
        System.out.println(date1);
        String data3 = DateWrapper.getLocalDateWithPattern(date1, "MM, dd, yyyy");
        System.out.println(data3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate date4 = DateWrapper.getLocalDateWithNewPattern("марта 7, 2020", formatter);
        System.out.println(date4);
        Period period = DateWrapper.getPeriodBetweenDates(date1, date);
        System.out.println(period);
    }
}
