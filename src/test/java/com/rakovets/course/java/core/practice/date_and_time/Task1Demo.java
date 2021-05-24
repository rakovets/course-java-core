package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task1;

import java.time.LocalDate;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 dateWrapper = new Task1();
        String date = "11-01-20";
        String pattern = "dd-MM-yy";
        System.out.println(Task1.getLocalDate(2020, 1, 11));
        System.out.println(Task1.getDateAfterQuantityNMonth(LocalDate.now(), 5));
        System.out.println(Task1.getDateFormatPattern(LocalDate.now(), pattern));
        System.out.println(Task1.getLocalDateFormatPattern(date, pattern));
        System.out.println(Task1.getQuantityDaysBetweenDates(LocalDate.of(2010, 11, 11),
                LocalDate.of(2020, 11, 1)));
    }
}
