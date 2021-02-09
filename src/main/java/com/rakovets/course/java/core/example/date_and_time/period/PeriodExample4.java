package com.rakovets.course.java.core.example.date_and_time.period;

import java.time.Period;

public class PeriodExample4 {
    public static void main(String[] args) {
        Period period2d = Period.ofDays(2);
        Period period8d = period2d.withDays(8);
        Period period2y1m2d = period2d.withYears(2).withMonths(1);

        System.out.println(period2d);
        System.out.println(period8d);
        System.out.println(period2y1m2d);
    }
}
