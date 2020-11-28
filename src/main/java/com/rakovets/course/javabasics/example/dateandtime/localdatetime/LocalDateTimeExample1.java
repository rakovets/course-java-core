package com.rakovets.course.javabasics.example.dateandtime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample1 {
    public static void main(String[] args) {
        // Секунды и наносекунды равны нулю
        LocalDateTime date1 = LocalDateTime.of(2014, 9, 19, 14, 5);
        // Наносекунды равны нулю
        LocalDateTime date2 = LocalDateTime.of(2014, 9, 19, 14, 5, 20);
        LocalDateTime date3 = LocalDateTime.of(2014, 9, 19, 14, 5, 20, 9);

        LocalDate date = LocalDate.now();
        LocalDateTime date4 = date.atTime(14, 30, 59, 999999);

        LocalTime time = LocalTime.now();
        LocalDateTime date5 = time.atDate(date);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
    }
}
