package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate date1 = DateWrapper.getLocalDate(2021, 5, 1);
        System.out.println(date1);

        LocalDate date2 = DateWrapper.getLocalDateWithChangedMonth(date1, 8);
        System.out.println(date2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        String dateString = DateWrapper.getStringWithDate(date2, formatter);
        System.out.println(dateString);

        String str = "May, 02, 2021";
        LocalDate date3 = DateWrapper.makeLocalDateFromString(str, formatter);
        System.out.println(date3);

        int days = DateWrapper.getNumberDayBetweenTwoDates(date1, date3);
        System.out.printf("Number days between two dates = %d\n", days);

        Temporal date4 = DateWrapper.adjustInto(date3, 21);
        System.out.println(date4);

        Temporal date5 = DateWrapper.adjustInto(LocalDate.of(2021, 5, 2));
        System.out.println(date5);
    }
}
