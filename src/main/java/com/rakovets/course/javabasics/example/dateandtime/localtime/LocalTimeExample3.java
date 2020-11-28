package com.rakovets.course.javabasics.example.dateandtime.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample3 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hourAMPM = now.get(ChronoField.HOUR_OF_AMPM); // 0 - 11
        int hourDay = now.get(ChronoField.HOUR_OF_DAY); // 0 - 23
        int minuteDay = now.get(ChronoField.MINUTE_OF_DAY); // 0 - 1,439
        int minuteHour = now.get(ChronoField.MINUTE_OF_HOUR); // 0 - 59
        int secondDay = now.get(ChronoField.SECOND_OF_DAY); // 0 - 86,399
        int secondMinute = now.get(ChronoField.SECOND_OF_MINUTE);// 0 - 59
        long nanoDay = now.getLong(ChronoField.NANO_OF_DAY);//0-86399999999
        int nanoSecond = now.get(ChronoField.NANO_OF_SECOND);//0-999999999

        System.out.println("Часы: " + hourAMPM);
        System.out.println("Часы: " + hourDay);
        System.out.println("Минуты дня: " + minuteDay);
        System.out.println("Минуты: " + minuteHour);
        System.out.println("Секунды дня: " + secondDay);
        System.out.println("Секунды: " + secondMinute);
        System.out.println("Наносекунды дня: " + nanoDay);
        System.out.println("Наносекунды: " + nanoSecond);
    }
}
