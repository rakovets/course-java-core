package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeUtilits {

    public LocalDate getDate(int year,int month, int day ) {
        return LocalDate.of(year,month,day);

    }
    public LocalDate getMonthAfter(LocalDate date, int month) {
        return date = date.plusMonths(month);
    }
    public String getDateFormatInString(LocalDate date, String formatter) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(formatter);
       return date.format(formatter1);
    }
    public LocalDate getDateFormat(String date, String formatter) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(formatter);
        return LocalDate.parse(date, formatter1);
    }
    public int getAmountOfDays(LocalDate date, LocalDate date1) {

        return 0;
    }
}
