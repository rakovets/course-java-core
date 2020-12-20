package com.rakovets.course.javabasics.example.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample1Parse {
    public static void main(String[] args) {
        String dateTimePattern = "MMMM d, yyyy HH:mm:ss";
        String dateTimeAsString = "June 5, 2020 12:10:56";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimePattern);
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeAsString, dateTimeFormatter);

        System.out.printf("'%s' parse to '%s'\n", dateTimeAsString, localDateTime);

        String dateFormatterPattern = "MMMM d, yyyy";
        String dateAsString = "June 5, 2020";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormatterPattern);
        LocalDate localDate = LocalDate.parse(dateAsString, dateFormatter);

        System.out.printf("'%s' parse to '%s'\n", dateAsString, localDate);
    }
}
