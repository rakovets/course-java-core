package com.rakovets.course.javabasics.example.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample2Format {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        String dateTimePattern = "MMMM, dd, yyyy HH:mm:ss";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimePattern, Locale.US);
        String dateTimeAsString = dateTime.format(dateTimeFormatter);

        System.out.printf("'%s' format to '%s'\n", dateTime, dateTimeAsString);

        LocalDate date = LocalDate.now();
        String datePattern = "MMMM-dd-yyyy";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern, Locale.US);
        String dateAsString = dateTime.format(dateFormatter);

        System.out.printf("'%s' format to '%s'\n", date, dateAsString);
    }
}
