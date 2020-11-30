package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        LocalDate currentDate = DateWrapper.getLocaleDate(1981,12,05);
        LocalDate currentDate2 = DateWrapper.getLocaleDate(1983,10,07);

        System.out.println("Current Date  " + currentDate + "\n");
        int n = 3;
        System.out.println("Current Date + " + n + " " + DateWrapper.getLocaleDatePlusN(currentDate, n));

        String format = "dd / M / yyyy";
        String result = DateWrapper.getDateUsePattern(currentDate,format);
        System.out.println(result);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy HH:mm");
        String date = "3 September, 2018 12:10";
        LocalDateTime resultDate = DateWrapper.getDateUsePatternString(date, formatter);
        System.out.println("last " + resultDate.toString());

        System.out.println("Delta " + DateWrapper.getPeriodBetweenMonth(currentDate,currentDate2));




    }
}
