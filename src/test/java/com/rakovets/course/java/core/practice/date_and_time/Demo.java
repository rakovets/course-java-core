package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.DateWrapper;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        System.out.println(DateWrapper.getLocalDate(2012,6,4));

        LocalDate localDate = LocalDate.of(2012,3,5);
        System.out.println(DateWrapper.getLocalDatePlusMonth(localDate,5));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(DateWrapper.getStringDate(localDate, dateFormatter));

        System.out.println(DateWrapper.getLocalDateFromString("22-07-2010", dateFormatter));

        LocalDate localDate1 = LocalDate.of(2012,3,5);
        LocalDate localDate2 = LocalDate.of(2016,5,5);

        System.out.println(DateWrapper.getPeriodBetweenLocalDate(localDate1,localDate2));


    }
}
