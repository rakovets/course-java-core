package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        TimeUtilits timeUtilits = new TimeUtilits();
        LocalDate date = timeUtilits.getDate(2020, 07, 5);
        LocalDate date1 = timeUtilits.getDate(2020, 10, 5);
        String format = "yyyy-dd-MM";
        String format1 ="MMMM d, yyyy";
        String dateString = "2020-10-05";
        System.out.println(timeUtilits.getDateFormat(dateString,format));
        System.out.println(timeUtilits.getMonthAfter(date1,2));
        System.out.println(timeUtilits.getDateFormatInString(date,format1));
        System.out.println(timeUtilits.getAmountOfDays(date,date1));
    }
}
