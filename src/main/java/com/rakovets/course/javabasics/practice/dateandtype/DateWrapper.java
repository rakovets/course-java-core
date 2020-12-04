package com.rakovets.course.javabasics.practice.dateandtype;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateWrapper {
    public LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
    public Date getDate(long millis) {
        Date date = new Date(millis);
        return date;
    }

    public Date getDateCalendar(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.getTime();
    }

    public LocalDate getNextDate(LocalDate localDate, int numberOfMonth) {
        return localDate.plusMonths(numberOfMonth);
    }
    public Date getNextDate(Calendar calendar, int numberOfMonth) {
        calendar.add(Calendar.MONTH, numberOfMonth);
        return calendar.getTime();
    }

    public String getDateFormat(LocalDate localDate, String formatter) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
        return localDate.format(dateTimeFormatter);
    }
    public String getDateFormat(Date date, String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
    public String getDateFormat(Calendar calendar, String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(calendar.getTime());
    }

    public LocalDate getLocalDate(String date, String formatter) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
        return LocalDate.parse(date, dateTimeFormatter);
    }

    public long getDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }

    public LocalDate changeDate(LocalDate localDate, int days) {
        TemporalAdjuster temporalAdjuster = temporal -> temporal.plus(Period.ofDays(days));
        return localDate.with(temporalAdjuster);
    }

    public LocalDate changeDateToNearest1stJanuary(LocalDate localDate) {
        LocalDate firstDayOfTheYear = localDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate firstDayOfTheNextYear = localDate.with(TemporalAdjusters.firstDayOfNextYear());
        TemporalAdjuster temporalAdjuster = (temporal -> {
            if (getDaysBetweenDates(localDate, firstDayOfTheNextYear) <
                    (getDaysBetweenDates(firstDayOfTheYear, localDate))) {
                temporal = firstDayOfTheNextYear;
            } else {
                temporal = firstDayOfTheYear;
            } return temporal;
        });
        return localDate.with(temporalAdjuster);
    }
}
