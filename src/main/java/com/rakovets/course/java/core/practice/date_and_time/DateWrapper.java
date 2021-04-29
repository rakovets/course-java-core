package com.rakovets.course.java.core.practice.date_and_time;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapper {
    public static LocalDate localDate(int year, int months, int day) {
      return   LocalDate.of(year,months,day);
    }

    public  static LocalDate addToLocalDate(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    public static String patternLocalDate(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }
}
