package com.rakovets.course.java.core.practice.date_and_time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Stream;

public class DateWrapperTest {

    @Test
    void getDateTest() {
        LocalDate localDate1 = DateWrapper.getLocalDate(1994, 7, 12);
        assertEquals("1994-07-12", localDate1.toString());
    }

    @Test
    void addMonthsTest() {
        LocalDate localDate1 = DateWrapper.getLocalDate(1994, 7, 12);
        LocalDate localDate2 = DateWrapper.addMonths(localDate1, 3);
        assertEquals("1994-10-12", localDate2.toString());
    }

    @Test
    void localDatePatternTest() {
        LocalDate localDate1 = DateWrapper.getLocalDate(1994, 7, 12);
        assertEquals("12 July 1994", DateWrapper.localDatePattern(localDate1, "d MMMM yyyy"));
    }

    @Test
    void localDateFormatTest() {
        assertEquals("2009-05-19", DateWrapper.localDateFormat("19/05/2009", "dd/MM/yyyy").toString());
    }

    @Test
    void daysBetweenTest() {
        LocalDate localDate1 = DateWrapper.getLocalDate(1994, 7, 12);
        LocalDate localDate2 = DateWrapper.getLocalDate(1995, 7, 13);
        assertEquals(366, DateWrapper.daysBetweenLocalDates(localDate1, localDate2));
    }

    @Test
    void addDaysTest() {
        LocalDate localDate1 = DateWrapper.getLocalDate(1994, 7, 12);
        assertEquals("1994-07-15", localDate1.with(DateWrapper.addDays(3)).toString());
    }

    @Test
    static Stream<Arguments> adjustIntoTestArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(1995, 01, 1), LocalDate.of(1994, 07, 12)),
                Arguments.of(LocalDate.of(1994, 01, 1), LocalDate.of(1994, 03, 12))
        );
    }

    @ParameterizedTest
    @MethodSource("adjustIntoTestArguments")
    public void adjustIntoTest(LocalDate expected, Temporal temporal) {
        Assertions.assertEquals(expected, DateWrapper.adjustInto(temporal));
    }

    @Test
    void addMonthsDateTest() {
        Date date1 = new Date(1);
        LocalDate date2 = DateWrapper.addMonthsDate(date1, 5);
        assertEquals("1970-06-01", date2.toString());
    }

    @Test
    void datePatternTest() {
        Date date1 = new Date(1);
        assertEquals("1 January 1970", DateWrapper.datePattern(date1, "d MMMM yyyy"));
    }

    @Test
    void calendarDateTest() {
        Calendar calendar = new GregorianCalendar(1994, Calendar.JULY, 12);
        LocalDate localDate = DateWrapper.addMonthsCalendar(calendar, 3);
        assertEquals("1994-10-12", localDate.toString());
    }

    @Test
    void calendarDatePatternTest() {
        Calendar calendar = new GregorianCalendar(1994, Calendar.JULY, 12);
        assertEquals("12 July 1994", DateWrapper.calendarDatePattern(calendar, "d MMMM yyyy"));
    }
}
