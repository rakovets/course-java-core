package com.rakovets.course.javabasics.practice.dateandtype;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapperDemo {
    public static void main(String[] args) {
        String formatter = "MM dd, yyyy";
        String date = "12 05, 2020";
        LocalDate localDateNow = LocalDate.now();
        LocalDate newYear2022 = LocalDate.of(2022, 01,01);
        DateWrapper dw = new DateWrapper();

        System.out.println(dw.getDate(2012, 05, 10));
        System.out.println(dw.getNextDate(localDateNow, 5));
        System.out.println(dw.getDateFormat(localDateNow, formatter));
        System.out.println(dw.getLocalDate(date, formatter));
        System.out.println(dw.getDaysBetweenDates(localDateNow, newYear2022) + " days between " + localDateNow + " and " + newYear2022);

    }
}
