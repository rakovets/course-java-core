package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    public static void main(String[] args) {
        //1
        LocalDate localDate1 = getLocalDateFromYearMonthDayOfMonth(2020, 4, 2);
        System.out.println(localDate1);

        //2
        LocalDate localDate2 = LocalDate.of(2020, 5, 10);
        LocalDate localDate2Updated = addMonthsToLocalDate(localDate2, 5);
        System.out.println(localDate2Updated);

        //3
        LocalDate localDate3 = LocalDate.of(2020, 3, 10);
        String pattern = "d-MMM-yyyy";
        System.out.println(getFormattedDateFromLocalDateWithPattern(localDate3, pattern));

        //4
        String date = "04 Aug 2015";
        String pattern2 = "dd MMM uuuu";
        System.out.println(getFormattedDateFromStringWithPattern(date, pattern2));

        //5
        LocalDate localDate4 = LocalDate.parse("2015-08-16");
        LocalDate localDate5 = LocalDate.parse("2016-08-16");
        System.out.println(getDifferenceBetweenDates(localDate4, localDate5));

    }

    private static LocalDate getLocalDateFromYearMonthDayOfMonth(int year, int month, int dayOfMonth) {
        return LocalDate.of(year, month, dayOfMonth);
    }

    private static LocalDate addMonthsToLocalDate(LocalDate localDate, int months) {
        return localDate.plusMonths(months);
    }

    private static String getFormattedDateFromLocalDateWithPattern(LocalDate localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDate.format(dateTimeFormatter);
    }

    private static LocalDate getFormattedDateFromStringWithPattern(String date, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(date, dateTimeFormatter);
    }

    private static long getDifferenceBetweenDates(LocalDate localDateFrom, LocalDate localDateTo) {
        long days = ChronoUnit.DAYS.between(localDateFrom, localDateTo);
        if (days < 0) {
            days = -days;
        }
        return days;
    }


}
