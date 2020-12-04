package com.rakovets.course.javabasics.practice.dateandtype;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateWrapperDemo {
    public static void main(String[] args) {
        String formatter = "dd MM, yyyy";
        String date = "12 05, 2020";
        LocalDate localDateNow = LocalDate.now();
        DateWrapper dw = new DateWrapper();

        System.out.println(dw.getDate(2012, 05, 10));
        System.out.println(dw.getNextDate(localDateNow, 5));
        System.out.println(dw.getDateFormat(localDateNow, formatter));
        System.out.println(dw.getLocalDate(date, formatter));

        System.out.println(dw.getDateCalendar(2020, 12, 25));

    }
}
