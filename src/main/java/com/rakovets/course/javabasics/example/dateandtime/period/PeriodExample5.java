package com.rakovets.course.javabasics.example.dateandtime.period;

import java.time.Period;

public class PeriodExample5 {
    public static void main(String[] args) {
        Period period5y4m3d = Period.of(5, 4, 3);
        Period period2y = Period.ofYears(2);
        // Добавление
        System.out.println(period5y4m3d.plusYears(4));
        System.out.println(period5y4m3d.plusMonths(3));
        System.out.println(period5y4m3d.plusDays(3));
        System.out.println(period5y4m3d.plus(period2y));

        // Вычитание
        System.out.println(period5y4m3d.minusYears(2));
        System.out.println(period5y4m3d.minusMonths(1));
        System.out.println(period5y4m3d.minusDays(1));
        System.out.println(period5y4m3d.minus(period2y));
    }
}
