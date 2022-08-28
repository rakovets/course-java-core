package com.rakovets.course.java.core.practice.date_and_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateWrapperDemo {
    public static void main(String[] args) {
        DateWrapper localDate = new DateWrapper();

        LocalDate newLocalDate = localDate.getLocalDate(2022, 8, 7);

        System.out.println(newLocalDate);
        System.out.println(newLocalDate.toString());
        System.out.println(localDate.getStringFromPattern(newLocalDate,"yyyy-M-d"));
        System.out.println(localDate.getLocalDateFromPattern("MM+dd+yy","10+13+14"));
        System.out.println(localDate.getLocalDatePlusMonth(newLocalDate, 3));

        LocalDate firstDate = LocalDate.of(1994, 12, 23);
        LocalDate secondDate = LocalDate.of(2003, 10, 13);

        System.out.println(localDate.getCountOfDifferenceBetweenLocalDates(firstDate, secondDate));
    }
}
