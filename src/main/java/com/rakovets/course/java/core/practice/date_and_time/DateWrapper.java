package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateWrapper {

    public static LocalDate getLocalDate(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }

    public static LocalDate changeLocalDate(LocalDate localDate, int numberOfMonths){
        return localDate.plusMonths(numberOfMonths);
    }

    public static String formatDateToString(LocalDate localDate, DateTimeFormatter formatter){
        return localDate.format(formatter);
    }

    public static LocalDate stringFormatToLocalDate(String date, DateTimeFormatter formatter){
        LocalDate localDate = LocalDate.parse(date,formatter);
        return localDate;
    }

    //public static  int gapeBetweenDatas(LocalDate dateOne, LocalDate dateTwo){

    //}

}
