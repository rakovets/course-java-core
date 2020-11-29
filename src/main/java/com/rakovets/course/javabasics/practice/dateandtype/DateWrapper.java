package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateWrapper {
    public static void main(String[] args) {
        System.out.println(localDateReturn());
        System.out.println(localDateReturnInMonth(localDateReturn(), 5));
        System.out.println(LocalDateWithPattern(localDateReturn(), "MM d, yyyy"));
        System.out.println(PatternWithLocalDate(localDateReturn(), "MM d, yyyy"));
        System.out.println(daysOfDifference(localDateReturn(), localDateReturnInMonth(localDateReturn(), -1)));
    }

    public static LocalDate localDateReturn() {
        LocalDate date = LocalDate.of(1993, 8, 26);
        return date;
    }

    public static LocalDate localDateReturnInMonth(LocalDate date, int month) {
        LocalDate date2 = date.plusMonths(month);
        return date2;
    }

    public static String LocalDateWithPattern(LocalDate date, String formatPattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
        return formatter.format(date);
    }

    public static LocalDate PatternWithLocalDate(LocalDate date, String formatPattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
        LocalDate localDate;
        return localDate = LocalDate.parse(formatter.format(date), formatter);
    }

    public static int daysOfDifference(LocalDate date, LocalDate date2) {
        int count = 0;
        LocalDate n = date;
        LocalDate n2 = date2;
        if (n != n2) {
            while (!n.isEqual(n2)) {
                if (n.isBefore(n2)) {
                    n = n.plusDays(1);
                } else {
                    n = n.minusDays(1);
                }
                count++;
            }
        }
        return count;
    }
}
