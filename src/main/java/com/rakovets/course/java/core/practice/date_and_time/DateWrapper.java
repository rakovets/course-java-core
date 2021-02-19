package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateWrapper {
    public static LocalDate getDate(int year, int month, int day) { // принимает год, месяц, день и возвращает LocalDate
        return LocalDate.of(year, month, day);
    }
    // принимает LocalDate, количество месяцев и возвращает LocalDate, представляющий собой дату через N месяцев после переданной
    public static LocalDate getDatePlusMonths(LocalDate ld, int months) {
        return ld.plusMonths(months);
    }
    // принимающий LocalDate, формат паттерн и возвращающий строку согласно этому паттерну
    public static String getStringDate(LocalDate ld, DateTimeFormatter dtf) {
        return ld.format(dtf);
    }
    // принимающий строку, формат паттерн и возвращающий LocalDate согласно этому паттерну
    public static LocalDate getLocalDate(String string, DateTimeFormatter dateFormat) {
        return LocalDate.parse(string, dateFormat);
    }
    // принимающий два параметра типа `LocalDate` и возвращающий количество дней между этими двумя датами
    public static long getDifference(LocalDate ld1, LocalDate ld2) {
        return ChronoUnit.DAYS.between(ld1, ld2);
    }

}
