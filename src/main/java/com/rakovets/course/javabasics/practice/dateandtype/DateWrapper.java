package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;

public class DateWrapper {

    public static LocalDate getLocaleDate(int year, int moth, int day){

        return LocalDate.of(year,moth,day);
    }

    public static LocalDate getLocaleDatePlusN(LocalDate current, int month){

        return current.plusMonths(month);
    }
}
