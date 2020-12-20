package com.rakovets.course.javabasics.example.dateandtime.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantExample2 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        long seconds = now.getEpochSecond(); // Получить секунды
        int nanos1 = now.getNano(); //Получить наносекунды
        // Получить значение как int
        int millis = now.get(ChronoField.MILLI_OF_SECOND);
        // Получить значение как long
        long nanos2 = now.getLong(ChronoField.NANO_OF_SECOND);

        System.out.println("Секунды: " + seconds);
        System.out.println("Наносекунды: " + nanos1);
        System.out.println("Милисекунды: " + millis);
        System.out.println("Наносекунды: " + nanos2);
    }
}
