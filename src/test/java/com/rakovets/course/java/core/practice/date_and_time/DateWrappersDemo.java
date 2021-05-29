package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

public class DateWrappersDemo {
    public static void main(String[] args) {
        LocalDate date = DateWrapper.changeToLocalDate(2014 ,8,29);
        System.out.println("I waiting 2014-8-29 :" + date);

        LocalDate changeNMonth = DateWrapper.changeMonthInLocalDate(LocalDate.of(2014,8,29),4);
        System.out.println("DAte after 4 month after 2014-8-29 (waiting 2014-12-29): " + changeNMonth);

        String changeDateWithPattern = DateWrapper.changeLocalDateToStringWithPattern(LocalDate.of(2014,8,29), DateTimeFormatter.ofPattern("MMM, dd, yyyy", Locale.ENGLISH));
        System.out.println("Change LocalDate to string with pattern:  " + changeDateWithPattern);

        LocalDate changeStringToLocalDate = DateWrapper.changeStringToLocalDateWithPattern("08.29.2014",DateTimeFormatter.ofPattern("MM.dd.yyyy"));
        System.out.println("Change String to LocalDate with pattern:  " + changeStringToLocalDate);

        LocalDate firstDate = LocalDate.of(2014,8,29);
        LocalDate secondDate = LocalDate.of(2016,8,29);
        long daysBetweenTwoDates = DateWrapper.getDaysBetweenDates (firstDate,secondDate);
        System.out.println("Days between 2016 and 2014: " + daysBetweenTwoDates);

        System.out.println(new TaskTemporalAdjuster(21).adjustInto(date));

        System.out.println(new TaskTemporalAdjuster2().adjustInto(LocalDate.of(2020, 07, 01)));

    }
}
