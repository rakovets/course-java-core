package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataUtil {

    public static LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate rewindMonth(LocalDate nowDate, int month) {
        return nowDate.plusMonths(month);
    }

    public static String isPatternDate(LocalDate nowDate, String datePattern) {
        return nowDate.format(DateTimeFormatter.ofPattern(datePattern, Locale.TRADITIONAL_CHINESE));
    }

    public static LocalDate isPatternDate(String nowDate, String datePattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(datePattern, Locale.ENGLISH);
        return LocalDate.parse(nowDate, dateTimeFormatter);
    }

    public static long isTimeInterval(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date2, date1));
    }
}
