package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DateWrapper {

    public static LocalDate dMY(int year,int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static LocalDate monthLocal(LocalDate date, int amountmonth){
        return date.plusMonths(amountmonth);
    }

    public static String patternOfDate(LocalDate date, String pattern){
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate stringPattern(String time, String pattern){
        return LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern,Locale.UK));
    }

    public static long daysBetweenDates(LocalDate first, LocalDate second){
        return ChronoUnit.DAYS.between(first,second);
    }

    public static Temporal addDays(Temporal temporal, int days){
        return temporal.plus(days, ChronoUnit.DAYS);
    }

    public static Temporal closerToJan(Temporal temporal){
    boolean leap = temporal.get(ChronoField.YEAR) % 4 == 0;
    final int HALF_OF_LEAP_YEAR = 366/2;
    final int HALF_OF_DEFAULT_YEAR = 365/2;
    int quantityOfDays = (int)ChronoUnit.DAYS.between(temporal,LocalDate.of(temporal.get(ChronoField.YEAR)+1,1,1));
    if(leap && quantityOfDays < HALF_OF_DEFAULT_YEAR || !leap && quantityOfDays <= HALF_OF_LEAP_YEAR){
        temporal = temporal.with(ChronoField.YEAR, temporal.get(ChronoField.YEAR)+1);
        return temporal .with(ChronoField.MONTH_OF_YEAR, 1).with(ChronoField.DAY_OF_MONTH,1);
    }
    else
        return temporal.with(ChronoField.MONTH_OF_YEAR,1).with(ChronoField.DAY_OF_MONTH,1);
    }
}
