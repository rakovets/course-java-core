package com.rakovets.course.javabasics.example.dateandtime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample5With {
    public static void main(String[] args) {
        LocalTime noon = LocalTime.of(12, 0, 0);

        LocalTime ten = noon.with(ChronoField.HOUR_OF_DAY, 10);
        LocalTime eight = noon.withHour(8);
        LocalTime twelveThirty = noon.withMinute(30);
        LocalTime thirtyTwoSeconds = noon.withSecond(32);

        // Можно использовать сцепление методов
        LocalTime secondsNano = noon.withSecond(20).withNano(999999);

        System.out.println("ten: " + ten);
        System.out.println("eight: " + eight);
        System.out.println("twelveThirty: " + twelveThirty);
        System.out.println("thirtyTwoSeconds: " + thirtyTwoSeconds);
        System.out.println("secondsNano: " + secondsNano);
    }
}
