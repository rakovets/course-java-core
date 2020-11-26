package com.rakovets.course.javabasics.example.dateandtime.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample4 {
    public static void main(String[] args) {
        Instant now = Instant.ofEpochSecond(0);
        // Добавление
        Instant instant1 = now.plusSeconds(400);
        Instant instant2 = now.plusMillis(98622200);
        Instant instant3 = now.plusNanos(300013890);
        Instant instant4 = now.plus(2, ChronoUnit.MINUTES);

        // Вычитание
        Instant instant5 = now.minusSeconds(2);
        Instant instant6 = now.minusMillis(1);
        Instant instant7 = now.minusNanos(1);
        Instant instant8 = now.minus(10, ChronoUnit.SECONDS);

        System.out.println(now);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(instant4);

        System.out.println(instant5);
        System.out.println(instant6);
        System.out.println(instant7);
        System.out.println(instant8);
    }
}
