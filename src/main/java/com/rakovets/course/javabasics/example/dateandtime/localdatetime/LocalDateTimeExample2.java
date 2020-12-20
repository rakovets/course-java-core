package com.rakovets.course.javabasics.example.dateandtime.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Год: " + year);
        System.out.println("День в году: " + dayYear);
        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);
    }
}
