package com.rakovets.course.javabasics.example.dateandtime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample6PlusMinus {
    public static void main(String[] args) {
        LocalTime fiveThirty = LocalTime.of(5, 30);
        // Добавление
        LocalTime sixThirty = fiveThirty.plusHours(1);
        LocalTime fiveForty = fiveThirty.plusMinutes(10);
        LocalTime plusSeconds = fiveThirty.plusSeconds(14);
        LocalTime plusNanos = fiveThirty.plusNanos(99999999);
        LocalTime sevenThirty = fiveThirty.plus(2, ChronoUnit.HOURS);

        // Вычитание
        LocalTime fourThirty = fiveThirty.minusHours(1);
        LocalTime fiveTen = fiveThirty.minusMinutes(20);
        LocalTime minusSeconds = fiveThirty.minusSeconds(2);
        LocalTime minusNanos = fiveThirty.minusNanos(1);
        LocalTime fiveTwenty = fiveThirty.minus(10, ChronoUnit.MINUTES);

        System.out.println("sixThirty: " + sixThirty);
        System.out.println("fiveForty: " + fiveForty);
        System.out.println("plusSeconds: " + plusSeconds);
        System.out.println("plusNanos: " + plusNanos);
        System.out.println("sevenThirty: " + sevenThirty);

        System.out.println("fourThirty: " + fourThirty);
        System.out.println("fiveTen: " + fiveTen);
        System.out.println("minusSeconds: " + minusSeconds);
        System.out.println("minusNanos: " + minusNanos);
        System.out.println("fiveTwenty: " + fiveTwenty);
    }
}
