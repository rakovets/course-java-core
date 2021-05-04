package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DataUtil implements TemporalAdjuster {

    public static LocalDate getDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static Calendar getDateJavaCalendar(int year, int month, int day) {
        return new GregorianCalendar(year, month, day) {
            @Override
            public String toString() {
                return year + "-" + month + "-" + day;
            }
        };
    }

    public static LocalDate plusMonths(LocalDate nowDate, int month) {
        return nowDate.plusMonths(month);
    }

    public static Date plusMonths(Date nowDate, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static String getFormatLocalDateByString(LocalDate nowDate, String datePattern) {
        return nowDate.format(DateTimeFormatter.ofPattern(datePattern, Locale.ENGLISH));
    }

    public static LocalDate getFormatStringDateByLocalDate(String nowDate, String datePattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(datePattern, Locale.ENGLISH);
        return LocalDate.parse(nowDate, dateTimeFormatter);
    }

    public static String getFormatDateByString(Date nowDate, String datePattern) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        Format simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Date getStringDateByDate(String nowDate, String datePattern) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(datePattern, Locale.CANADA);
        return dateFormat.parse(nowDate);
    }

    public static long findTimeInDaysBetweenDates(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date2, date1));
    }

    public static long findTimeInDaysBetweenDates(Date date1, Date date2) {
        final int MILLISECONDS_IN_DAY = 86_400_000;
        return Math.abs(date2.getTime() - date1.getTime()) / MILLISECONDS_IN_DAY;
    }

    public Temporal adjustInto(Temporal date) {
        final int JANUARY = 1;
        int year = date.get(ChronoField.YEAR);
        LocalDate dateFirstJanuaryThisYear = LocalDate.of(year, JANUARY, JANUARY);
        LocalDate dateFirstJanuaryNextYear = LocalDate.of(year + 1, JANUARY, JANUARY);
        if (Math.abs(ChronoUnit.DAYS.between(dateFirstJanuaryThisYear, date)) >
                Math.abs(ChronoUnit.DAYS.between(dateFirstJanuaryNextYear, date))) {
            date = dateFirstJanuaryNextYear;
        } else {
            date = dateFirstJanuaryThisYear;
        }
        return date;
    }

    public Temporal adjustInto(Temporal temporal, int addDays) {
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
