package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();

        LocalDate localDate3 = dateWrapper.buildLocalDate(2021, 11, 12);

        LocalDate localDate5 = dateWrapper.buildLocalDate(2021, 1, 1);

        LocalDate localDate6 = dateWrapper.buildLocalDate(2020, 1, 1);

        System.out.println("Task1: ");

        LocalDate localDate = dateWrapper.buildLocalDate(2020, 12, 12);
        System.out.println(localDate);

        System.out.println("Task2: ");

        LocalDate localDate1 = dateWrapper.changeLocalDate(localDate, 1);
        System.out.println(localDate1);

        System.out.println("Task3: ");

        String pattern1 = dateWrapper.buildLocalPattern(localDate, "MMMM d, yyyy");
        System.out.println(pattern1);

        System.out.println("Task4: ");

        LocalDate localDate2 = dateWrapper.buildLocalString("MMMM d, yyyy", "November 20, 2020");
        System.out.println(localDate2);

        System.out.println("Task5: ");

        long days = dateWrapper.getDifferenceLocalDate(localDate3, localDate);
        System.out.println(days);

        System.out.println("Task6: ");

        TemporalAdjuster temporalAdjuster = dateWrapper.getSumDate(localDate, 412);
        System.out.println(temporalAdjuster);

        System.out.println("Task7: ");

        LocalDate localDate4 = dateWrapper.getJanuaryYear(localDate, localDate6, localDate5);
        System.out.println(localDate4);
    }
}
