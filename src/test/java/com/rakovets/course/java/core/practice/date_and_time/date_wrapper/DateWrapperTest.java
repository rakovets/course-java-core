package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Stream;

class DateWrapperTest {

    @Test
    void getLocalDate() {
        //Given
        LocalDate expectedResult = LocalDate.of(2020, 10, 20);
        //When
        LocalDate actualResult = DateWrapper.getDate(2020, 10, 20);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLocalDatePlusMonth() {
        //Given
        LocalDate expectedResult = LocalDate.of(2020, 12, 20);
        LocalDate localDate = LocalDate.of(2020, 10, 20);
        //When
        LocalDate actualResult = DateWrapper.getLocalDatePlusMonth(localDate, 2);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getStringDate() {
        //Given
        String expectedResult = "20-10-2020";
        LocalDate localDate = LocalDate.of(2020, 10, 20);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.getStringDate(localDate, dateFormatter);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getLocalDateFromString() {
        //Given
        LocalDate expectedResult = LocalDate.of(2020, 10, 20);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //When
        LocalDate actualResult = DateWrapper.getLocalDateFromString("20-10-2020", dateFormatter);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getDaysBetween() {
        //Given
        LocalDate localDate1 = LocalDate.of(2020, 10, 20);
        LocalDate localDate2 = LocalDate.of(2020, 12, 10);
        int expectedResult = 51;
        //When
        long actualResult = DateWrapper.getDaysBetween(localDate1, localDate2);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void adjustDay() {
        //Given
        LocalDate localDate = LocalDate.of(2020, 10, 20);
        LocalDate expectedResult = LocalDate.of(2020, 10, 25);
        //When
        LocalDate actualResult = DateWrapper.adjustDay(localDate, 5);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getFirstJanuaryProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, 1, 1), LocalDate.of(2020, 7, 2)),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 7, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("getFirstJanuaryProviderArguments")
    void getFirstJanuary(LocalDate expectedResult, LocalDate localDate) {
        // WHEN
        LocalDate actualResult = DateWrapper.getFirstJanuary(localDate);
        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void getDateForDate() {
        //Given
        String expectedResult = "01-11-2021";
        Date date = new Date(1635770792000L);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.getDate(date, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetLocalDatePlusMonth() {
        //Given
        String expectedResult = "01-01-2022";
        Date date = new Date(1635770792000L);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.getDatePlusMonth(date, 2, dateFormat);
        //ThanalDate
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetStringDate() {
        //Given
        String expectedResult = "01-11-2021";
        Date date = new Date(1635770792000L);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.getStringDate(date, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void testGetDaysBetween() {
        //Given
        Date date1 = new Date(1635770792000L);
        Date date2 = new Date(1640436392000L);
        long expectedResult = 54;
        //When
        long actualResult = DateWrapper.getDaysBetween(date1, date2);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAdjustDay() {
        //Given
        String expectedResult = "07-11-2021";
        Date date = new Date(1635770792000L);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.adjustDay(date, 6, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getFirstJanuaryForDateProviderArguments() {
        return Stream.of(
                Arguments.of("01-01-2022", new Date(1635770792000L), new SimpleDateFormat("dd-MM-yyyy")),
                Arguments.of("01-01-2021", new Date(1625143592000L), new SimpleDateFormat("dd-MM-yyyy"))
        );
    }

    @ParameterizedTest
    @MethodSource("getFirstJanuaryForDateProviderArguments")
    void getFirstJanuaryForDate(String expectedResult, Date date, DateFormat dateFormat) {
        // WHEN
        String actualResult = DateWrapper.getFirstJanuary(date, dateFormat);
        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void testGetDateForCalendar() {
        //Given
        String expectedResult = "20-12-2020";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(2020, Calendar.DECEMBER, 20);
        //When
        String actualResult = DateWrapper.getDate(calendar, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetDatePlusMonth() {
        //Given
        String expectedResult = "20-12-2020";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(2020, Calendar.OCTOBER, 20);
        //When
        String actualResult = DateWrapper.getDatePlusMonth(calendar, 2, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetStringDate1() {
        //Given
        String expectedResult = "20-12-2020";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar(2020, Calendar.DECEMBER, 20);
        //When
        String actualResult = DateWrapper.getStringDate(calendar, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetDaysBetween1() {
        //Given
        Calendar calendar1 = new GregorianCalendar(2020, Calendar.NOVEMBER, 1);
        Calendar calendar2 = new GregorianCalendar(2020, Calendar.DECEMBER, 21);
        long expectedResult = 50;
        //When
        long actualResult = DateWrapper.getDaysBetween(calendar1, calendar2);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAdjustDay1() {
        //Given
        String expectedResult = "07-11-2021";
        Calendar calendar = new GregorianCalendar(2021, Calendar.NOVEMBER, 1);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //When
        String actualResult = DateWrapper.adjustDay(calendar, 6, dateFormat);
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getFirstJanuaryForCalendarProviderArguments() {
        return Stream.of(
                Arguments.of("01-01-2021", new GregorianCalendar(2020, Calendar.JULY, 2), new SimpleDateFormat("dd-MM-yyyy")),
                Arguments.of("01-01-2020", new GregorianCalendar(2020, Calendar.JULY, 1), new SimpleDateFormat("dd-MM-yyyy"))
        );
    }

    @ParameterizedTest
    @MethodSource("getFirstJanuaryForCalendarProviderArguments")
    void getFirstJanuaryForCalendar(String expectedResult, Calendar calendar, DateFormat dateFormat) {
        // WHEN
        String actualResult = DateWrapper.getFirstJanuary(calendar, dateFormat);
        // THAT
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
