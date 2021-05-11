package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task1;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate localDate = Task1.getLocalDate(2021, 5, 9);
        LocalDate localDate1 = Task1.getLocalDate(2021,12,10);
        LocalDate localDate2 = Task1.getLocalDate(2021,7,3);

        System.out.println("localDate = " + localDate);
        System.out.println("Date from 5 months = " + Task1.getLocalDateAddMonths(localDate, 5));
        System.out.println("Date with use pattern = " + Task1.getStringDatePatern(localDate));
        System.out.println("Date with use parse = " + Task1.getLocalDateFormat("19.05.2015", "d.M.yyyy"));
        System.out.println("Number of days between two dates = " + Task1.daysBetween(localDate, localDate1));

        System.out.println("Number of days from date = " + Task2.getTemporalAdjusterAddDays(100).adjustInto(localDate));
        System.out.println("Near the first of Jenuary to date = " + Task2.getNearFirstJenuary(localDate2).adjustInto(localDate2));
    }
}
