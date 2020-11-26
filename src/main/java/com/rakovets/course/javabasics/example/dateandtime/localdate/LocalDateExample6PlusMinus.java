package com.rakovets.course.javabasics.example.dateandtime.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample6PlusMinus {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2005 = newYear2001.plusYears(4);
        LocalDate march2001 = newYear2001.plusMonths(2);
        LocalDate january15Year2001 = newYear2001.plusDays(14);
        LocalDate lastWeekJanuary2001 = newYear2001.plusWeeks(3);
        LocalDate newYear2006 = newYear2001.plus(5, ChronoUnit.YEARS);

        LocalDate newYear2000 = newYear2001.minusYears(1);
        LocalDate nov2000 = newYear2001.minusMonths(2);
        LocalDate dec30Year2000 = newYear2001.minusDays(2);
        LocalDate lastWeekDec2001 = newYear2001.minusWeeks(1);
        LocalDate newYear1999 = newYear2001.minus(2, ChronoUnit.YEARS);

        System.out.println("newYear2005: " + newYear2005);
        System.out.println("march2001: " + march2001);
        System.out.println("january15Year2001: " + january15Year2001);
        System.out.println("lastWeekJanuary2001: " + lastWeekJanuary2001);
        System.out.println("newYear2006: " + newYear2006);

        System.out.println("newYear2000: " + newYear2000);
        System.out.println("nov2000: " + nov2000);
        System.out.println("dec30Year2000: " + dec30Year2000);
        System.out.println("lastWeekDec2001: " + lastWeekDec2001);
        System.out.println("newYear1999: " + newYear1999);
    }
}
