package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateWrapper {
    public static LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate getLocalDatePlusMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public static String getStringDate(LocalDate localDate, DateTimeFormatter formatter) {
        return localDate.format(formatter);
    }

    public static LocalDate getLocalDateFromString(String date, DateTimeFormatter formatter) {
        return LocalDate.parse(date, formatter);
    }

    public static long getDaysBetween(LocalDate localDate1, LocalDate localDate2) {
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static LocalDate adjustDay(LocalDate localDate, int days) {
        TemporalAdjuster dayAdjuster = TemporalAdjusters.ofDateAdjuster(date -> (date).plus(days, ChronoUnit.DAYS));
        return localDate.with(dayAdjuster);
    }

    public static LocalDate getFirstJanuary(LocalDate localDate) {
        TemporalAdjuster firstJanuaryAdjusterOfThisYear = TemporalAdjusters.firstDayOfYear();
        TemporalAdjuster firstJanuaryAdjusterOfNextYear = TemporalAdjusters.firstDayOfNextYear();
        if (localDate.getMonthValue() > 7) {
            return localDate.with(firstJanuaryAdjusterOfNextYear);
        }
        if (localDate.getMonthValue() == 7) {
            if (localDate.getDayOfMonth() >= 2) {
                return localDate.with(firstJanuaryAdjusterOfNextYear);
            }
        }
        return localDate.with(firstJanuaryAdjusterOfThisYear);
    }

    public static String getDate(Date date, DateFormat formatter) {
        return formatter.format(date);
    }

    public static String getDatePlusMonth(Date date, int month, DateFormat formatter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        date = calendar.getTime();
        return formatter.format(date);
    }

    public static String getStringDate(Date date, DateFormat formatter) {
        return formatter.format(date);
    }

    public static Date getDateFromString(String date, DateFormat formatter) throws ParseException {
        return formatter.parse(date);
    }

    public static long getDaysBetween(Date date1, Date date2) {
        LocalDate localDate1 = LocalDate.ofInstant(date1.toInstant(), ZoneId.systemDefault());
        LocalDate localDate2 = LocalDate.ofInstant(date2.toInstant(), ZoneId.systemDefault());
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static String adjustDay(Date date, int days, DateFormat formatter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        date = calendar.getTime();
        return formatter.format(date);
    }

    public static String getFirstJanuary(Date date, DateFormat formatter) {
        LocalDate localDate = new java.sql.Date(date.getTime()).toLocalDate();
        TemporalAdjuster firstJanuaryAdjusterOfThisYear = TemporalAdjusters.firstDayOfYear();
        TemporalAdjuster firstJanuaryAdjusterOfNextYear = TemporalAdjusters.firstDayOfNextYear();
        LocalDate localDateThisYear = localDate.with(firstJanuaryAdjusterOfThisYear);
        LocalDate localDateNextYear = localDate.with(firstJanuaryAdjusterOfNextYear);
        if (localDate.getMonthValue() > 7) {
            return formatter.format(java.sql.Date.valueOf(localDateNextYear));
        }
        if (localDate.getMonthValue() == 7) {
            if (localDate.getDayOfMonth() >= 2) {
                return formatter.format(java.sql.Date.valueOf(localDateNextYear));
            }
        }
        return formatter.format(java.sql.Date.valueOf(localDateThisYear));
    }

    public static String getDate(Calendar calendar, DateFormat formatter) {
        return formatter.format(calendar.getTime());
    }

    public static String getDatePlusMonth(Calendar calendar, int month, DateFormat formatter) {
        calendar.add(Calendar.MONTH, month);
        return formatter.format(calendar.getTime());
    }

    public static String getStringDate(Calendar calendar, DateFormat formatter) {
        Date date = calendar.getTime();
        return formatter.format(date);
    }


    public static long getDaysBetween(Calendar calendar1, Calendar calendar2) {
        LocalDate localDate1 = LocalDate.ofInstant(calendar1.toInstant(), ZoneId.systemDefault());
        LocalDate localDate2 = LocalDate.ofInstant(calendar2.toInstant(), ZoneId.systemDefault());
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static String adjustDay(Calendar calendar, int days, DateFormat formatter) {
        calendar.add(Calendar.DATE, days);
        return formatter.format(calendar.getTime());
    }

    public static String getFirstJanuary(Calendar calendar, DateFormat formatter) {
        Date date = calendar.getTime();
        LocalDate localDate = new java.sql.Date(date.getTime()).toLocalDate();
        TemporalAdjuster firstJanuaryAdjusterOfThisYear = TemporalAdjusters.firstDayOfYear();
        TemporalAdjuster firstJanuaryAdjusterOfNextYear = TemporalAdjusters.firstDayOfNextYear();
        if (localDate.getMonthValue() > 7) {
            return formatter.format(java.sql.Date.valueOf(localDate.with(firstJanuaryAdjusterOfNextYear)));
        }
        if (localDate.getMonthValue() == 7) {
            if (localDate.getDayOfMonth() > 1) {
                return formatter.format(java.sql.Date.valueOf(localDate.with(firstJanuaryAdjusterOfNextYear)));
            }
        }
        return formatter.format(java.sql.Date.valueOf(localDate.with(firstJanuaryAdjusterOfThisYear)));
    }
}
