package com.rakovets.course.javabasics.example.dateandtime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationExample1 {
    public static void main(String[] args) {
        Duration oneDay = Duration.ofDays(1);
        Duration oneHour = Duration.ofHours(1);
        Duration oneMin = Duration.ofMinutes(1);
        Duration tenSeconds = Duration.ofSeconds(10);
        Duration twoSeconds = Duration.ofSeconds(1, 1_000_000_000);
        Duration oneSecondFromMillis = Duration.ofMillis(1);
        Duration oneSecondFromNanos = Duration.ofNanos(1000000000);
        Duration oneSecond = Duration.of(1, ChronoUnit.SECONDS);

        System.out.println("oneDay: " + oneDay);
        System.out.println("oneHour: " + oneHour);
        System.out.println("oneMin: " + oneMin);
        System.out.println("tenSeconds: " + tenSeconds);
        System.out.println("twoSeconds: " + twoSeconds);
        System.out.println("oneSecondFromMillis: " + oneSecondFromMillis);
        System.out.println("oneSecondFromNanos: " + oneSecondFromNanos);
        System.out.println("oneSecond: " + oneSecond);
    }
}
