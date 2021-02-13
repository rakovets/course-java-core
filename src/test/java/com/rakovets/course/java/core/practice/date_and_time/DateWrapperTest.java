package com.rakovets.course.java.core.practice.date_and_time;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateWrapperTest {

    @Test
    void getLocalDate() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 2, 12);
        assertEquals("2021-02-12", localDate1.toString());
    }

    @Test
    void addMonths() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 2, 12);
        LocalDate localDate2 = DateWrapper.addMonths(localDate1, 5);
        assertEquals("2021-07-12", localDate2.toString());
    }

    @Test
    void localDatePattern() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 2, 12);
        assertEquals("12 February 2021", DateWrapper.localDatePattern(localDate1, "d MMMM yyyy"));
    }

    @Test
    void localDateFormat() {
        assertEquals("12 February 2021", DateWrapper.localDateFormat
                ("2021-02-12", "d MMMM yyyy"));
    }

    @Test
    void daysBetween() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 2, 12);
        LocalDate localDate2 = DateWrapper.getLocalDate(2022, 1, 1);
        assertEquals(323, DateWrapper.daysBetween(localDate1, localDate2));
    }

    @Test
    void addDays() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 2, 12);
        assertEquals("2021-02-22", localDate1.with(DateWrapper.addDays(10)).toString());
    }

    @Test
    void firstJanuary() {
        assertEquals("2021-01-01", DateWrapper.getLocalDate(2021, 2, 12).
                with(DateWrapper.firstJanuary(DateWrapper.getLocalDate(2021, 2, 12))).toString());
        assertEquals("2022-01-01", DateWrapper.getLocalDate(2021, 7, 12).
                with(DateWrapper.firstJanuary(DateWrapper.getLocalDate(2021, 7, 12))).toString());
    }

    @Test
    void addMonthsDate() {
        Date date1 = new Date(1600000000000L);
        LocalDate date2 = DateWrapper.addMonthsDate(date1, 5);
        assertEquals("2021-02-13", date2.toString());
    }

    @Test
    void datePattern() {
        Date date1 = new Date(1600000000000L);
        assertEquals("13 September 2020", DateWrapper.datePattern(date1, "d MMMM yyyy"));
    }

    @Test
    void calendarDate() {
        Calendar calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 12);
        LocalDate localDate = DateWrapper.addMonthsCalendar(calendar, 3);
        assertEquals("2021-05-12", localDate.toString());
    }

    @Test
    void calendarDatePattern() {
        Calendar calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 12);
        assertEquals("12 February 2021", DateWrapper.calendarDatePattern(calendar, "d MMMM yyyy"));
    }
}
