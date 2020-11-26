package com.rakovets.course.javabasics.example.dateandtime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
        LocalDate today = LocalDate.now();
        System.out.println(newYear2001);
        System.out.println(newYear2002);
        System.out.println(today);
    }
}
