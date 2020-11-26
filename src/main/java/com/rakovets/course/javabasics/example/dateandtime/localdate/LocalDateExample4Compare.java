package com.rakovets.course.javabasics.example.dateandtime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample4Compare {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);

        boolean after = newYear2001.isAfter(newYear2002);
        boolean before = newYear2001.isBefore(newYear2002);
        boolean equal = newYear2001.equals(newYear2002);
        boolean leapYear = newYear2001.isLeapYear();

        System.out.println("newYear2001.isAfter(newYear2002): " + after);
        System.out.println("newYear2001.isBefore(newYear2002): " + before);
        System.out.println("newYear2001.equals(newYear2002): " + equal);
        System.out.println("newYear2001.isLeapYear(): " + leapYear);
    }
}
