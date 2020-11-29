package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        TimeUtilits h = new TimeUtilits();
        LocalDate date = LocalDate.of(2020, 07, 5);
        String format = "MMMM d, yyyy";
       /// System.out.println(h.getDateInfFormat(date,format));

    }
}
