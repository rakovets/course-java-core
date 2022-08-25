package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        LocalDate localDate = task1.getLocalDate(2022, 5, 9);
        LocalDate localDate1 = task1.getLocalDate(2022, 12, 10);
        LocalDate localDate2 = task1.getLocalDate(2022, 12, 10);

        System.out.println("localDate = " + localDate);
        System.out.println("Date from 5 months = " + task1.getLocalDateAddMonths(localDate, 5));
        System.out.println("Date with use pattern = " + task1.getStringDatePatern(localDate));
        System.out.println("Date with use parse = " + task1.getLocalDateFormat("25.08.2022", "d.M.yyyy"));
        System.out.println("Number of days between two dates = " + task1.daysBetween(localDate, localDate1));
        System.out.println("Number of days from date = " + task2.getTemporalAdjusterAddDays(50).adjustInto(localDate));
        System.out.println("Near the first of Jenuary to date = " + task2.getNearFirstJenuary(localDate2).adjustInto(localDate2));
    }
}

