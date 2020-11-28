package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapper {
    public LocalDate getDate (int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
    public LocalDate getNextDate (LocalDate localDate, int numberOfMonth) {
        return localDate.plusMonths(numberOfMonth);
    }
    public String getDateFormat (LocalDate localDate, DateTimeFormatter dateTimeFormatter) {
        return localDate.format(dateTimeFormatter);
    }


}
