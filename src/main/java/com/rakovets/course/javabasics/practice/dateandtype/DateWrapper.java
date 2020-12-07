package com.rakovets.course.javabasics.practice.dateandtype;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateWrapper {
    public LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public LocalDate getDateAfterPeriod(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public Date getDateAfterPeriod(Calendar calendar, int month) {
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public String getDateByPattern(LocalDate localDate, String pattern) {
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern(pattern);
        return localDate.format(dataFormat);
    }

    public String getDateByPattern(Date date, String pattern) {
        DateFormat dataFormat = new SimpleDateFormat(pattern);
        return dataFormat.format(date);
    }

    public String getDateByPattern(Calendar calendar, String pattern) {
        DateFormat dataFormat = new SimpleDateFormat(pattern);
        return dataFormat.format(calendar.getTime());
    }

    public LocalDate getDate(String date, String pattern) {
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(date, dataFormat);
    }

    public long getDifferenceBetweenLocalDate(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static LocalDate getDateAfterNDays(LocalDate localDate, int n) {
        return localDate.with(temporal -> temporal.plus(Period.ofDays(n)));
    }
}
