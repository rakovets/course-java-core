package com.rakovets.course.javabasics.practice.dateandtype;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateWrapper {

    public static LocalDate getLocaleDate(int year, int moth, int day){

        return LocalDate.of(year,moth,day);
    }

    public static LocalDate getLocaleDatePlusN(LocalDate current, int month){

        return current.plusMonths(month);
    }

    public static String getDateUsePattern(LocalDate current, String format){

        DateTimeFormatter form = DateTimeFormatter.ofPattern(format);
          return current.format(form);
    }

    public static LocalDateTime getDateUsePatternString(String date, DateTimeFormatter formatter){

        return LocalDateTime.parse(date, formatter);
    }

    public static Period getPeriodBetweenMonth(LocalDate d1, LocalDate d2){
        return Period.between(d1,d2);
    }

}
