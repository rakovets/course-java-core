package com.rakovets.course.javabasics.example.dateandtime.period;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample3 {
    public static void main(String[] args) {
        Period period5y4m3d = Period.of(5, 4, 3);
        int days = period5y4m3d.getDays();
        int months = period5y4m3d.getMonths();
        int year = period5y4m3d.getYears();
        long days2 = period5y4m3d.get(ChronoUnit.DAYS);

        System.out.println("Дни: " + days);
        System.out.println("Месяца: " + months);
        System.out.println("Годы: " + year);
        System.out.println("Дни: " + days2);
    }
}
