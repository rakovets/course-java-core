package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {

    @Test
    void getLocalDate() {
        // GIVEN

        // WHEN
        LocalDate actualDate = DateWrapper.getLocalDate(2020, 10, 23);

        // THEN
        Assertions.assertEquals(LocalDate.of(2020, 10, 23), actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDateAfterMonth() {
        return Stream.of(
                Arguments.of("2020-07-23", 5,  LocalDate.of(2020, 2, 23)),
                Arguments.of("2021-02-23", 2, LocalDate.of(2020, 12, 23)),
                Arguments.of("2022-12-23", 24, LocalDate.of(2020, 12, 23))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDateAfterMonth")
    void getLocalDateAfterMonth(String expectedString, int month, LocalDate test) {
        // GIVEN

        // WHEN
        String actualString = DateWrapper.getDateAfterMonth(test, month).toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForFormatDateToString() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFormatDateToString")
    void formatDateToString(String expectedString, String pattern) {
        // GIVEN
        LocalDate test = LocalDate.of(2020, 2, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        // WHEN
        String actualString = DateWrapper.formatDateToString(test, formatter);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForParseStringToDate() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForParseStringToDate")
    void parseStringToDate(String string, String pattern) {
        // GIVEN
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        // WHEN
        LocalDate actualDate = DateWrapper.parseStringToDate(string, formatter);

        // THEN
        Assertions.assertEquals(LocalDate.of(2020, 2, 23), actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetDaysBetweenDates() {
        return Stream.of(
                Arguments.of(22L, LocalDate.of(2000, 1, 23)),
                Arguments.of(31L, LocalDate.of(2000, 2, 1)),
                Arguments.of(366L, LocalDate.of(2001, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDaysBetweenDates")
    void getDaysBetweenDates(long expectedLong, LocalDate second) {
        // GIVEN
        LocalDate first = LocalDate.of(2000, 1, 1);

        // WHEN
        long actualLong = DateWrapper.getDaysBetweenDates(first, second);

        // THEN
        Assertions.assertEquals(expectedLong, actualLong);
    }

    static Stream<Arguments> provideArgumentsForGetDateAfterDays() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 23), 22),
                Arguments.of(LocalDate.of(2000, 2, 1), 31),
                Arguments.of(LocalDate.of(2001, 1, 1), 366)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDateAfterDays")
    void getDateAfterDays(LocalDate expectedDate, int days) {
        // GIVEN
        LocalDate test = LocalDate.of(2000, 1, 1);

        // WHEN
        LocalDate actualDate = DateWrapper.getDateAfterDays(test, days);

        // THEN
        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForAdjustInto() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1), LocalDate.of(2000, 2, 20)),
                Arguments.of(LocalDate.of(2001, 1, 1),  LocalDate.of(2000, 9, 10)),
                Arguments.of(LocalDate.of(2000, 1, 1),  LocalDate.of(2000, 6, 15))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustInto")
    void adjustIntoClosestNewYear(LocalDate expectedDate, LocalDate date) {
        // GIVEN

        // WHEN
        LocalDate actualDate = (LocalDate) DateWrapper.closestNewYear.adjustInto(date);

        // THEN
        Assertions.assertEquals(expectedDate, actualDate);
    }

    @Test
    void getDate() {
        // GIVEN
        Date actualDate = new Date();

        // WHEN
        try {
            actualDate = DateWrapper.getDate(2021, 2, 14);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // THEN
        Assertions.assertEquals("Sun Feb 14 00:00:00 MSK 2021", actualDate.toString());
    }

    static Stream<Arguments> provideArgumentsForGetDateAfterMonth() {
        return Stream.of(
                Arguments.of("Wed Jul 14 00:00:00 MSK 2021", 5),
                Arguments.of("Sat May 14 00:00:00 MSK 2022", 15),
                Arguments.of("Tue Feb 14 00:00:00 MSK 2023", 24)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDateAfterMonth")
    void getDateAfterMonth(String expectedString, int month) {
        // GIVEN
        Date test = new Date();
        try {
            test = DateWrapper.getDate(2021, 2, 14);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // WHEN
        String actualString = DateWrapper.getDateAfterMonth(test, month).toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForFormatDateToStringForDate() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFormatDateToStringForDate")
    void formatDateToStringForDate(String expectedString, String pattern) {
        // GIVEN
        Date test = new Date();
        try {
            test = DateWrapper.getDate(2020, 2, 23);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);

        // WHEN
        String actualString = DateWrapper.formatDateToString(test, formatter);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForParseStringToDateForDate() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForParseStringToDateForDate")
    void parseStringToDateForDate(String string, String pattern) {
        // GIVEN
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
        Date actualDate = new Date();

        // WHEN
        try {
            actualDate = DateWrapper.parseStringToDateForDate(string, formatter);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // THEN
        Assertions.assertEquals("Sun Feb 23 00:00:00 MSK 2020", actualDate.toString());
    }

    @Test
    void getDaysBetweenDates() {
        // GIVEN
        Date test1 = new Date();
        try {
            test1 = DateWrapper.getDate(2020, 2, 14);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Date test2 = new Date();
        try {
            test2 = DateWrapper.getDate(2021, 2, 23);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // WHEN
        Long actualLong = DateWrapper.getDaysBetweenDates(test1, test2);

        // THEN
        Assertions.assertEquals(375L, actualLong);
    }

    @Test
    void getCalendar() {
        // GIVEN

        // WHEN
        Calendar actualCalendar = DateWrapper.getCalendar(2021, 2, 14);

        // THEN
        Assertions.assertEquals("Sun Feb 14 00:00:00 MSK 2021", actualCalendar.getTime().toString());
    }

    static Stream<Arguments> provideArgumentsForGetDateAfterMonthForCalendar() {
        return Stream.of(
                Arguments.of("Wed Jul 14 00:00:00 MSK 2021", 5),
                Arguments.of("Sat May 14 00:00:00 MSK 2022", 15),
                Arguments.of("Tue Feb 14 00:00:00 MSK 2023", 24)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDateAfterMonthForCalendar")
    void getDateAfterMonthForCalendar(String expectedString, int month) {
        // GIVEN
        Calendar test = DateWrapper.getCalendar(2021, 2, 14);

        // WHEN
        String actualString = DateWrapper.getDateAfterMonth(test, month).getTime().toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }


    static Stream<Arguments> provideArgumentsForFormatDateToStringForCalendar() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFormatDateToStringForCalendar")
    void formatDateToStringForCalendar(String expectedString, String pattern) {
        // GIVEN
        Calendar test = DateWrapper.getCalendar(2020, 2, 23);
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);

        // WHEN
        String actualString = DateWrapper.formatDateToString(test, formatter);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForParseStringToDateForCalendar() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForParseStringToDateForCalendar")
    void parseStringToDateForCalendar(String string, String pattern) {
        // GIVEN
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
        Calendar actualCalendar = Calendar.getInstance(Locale.US);

        // WHEN
        try {
            actualCalendar = DateWrapper.parseStringToDate(string, formatter);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // THEN
        Assertions.assertEquals("Sun Feb 23 00:00:00 MSK 2020", actualCalendar.getTime().toString());
    }

    @Test
    void getDaysBetweenDatesForCalendar() {
        // GIVEN
        Calendar test1 = DateWrapper.getCalendar(2020, 2, 14);
        Calendar test2 = DateWrapper.getCalendar(2021, 2, 23);

        // WHEN
        Long actualLong = DateWrapper.getDaysBetweenDates(test1, test2);

        // THEN
        Assertions.assertEquals(375L, actualLong);
    }
}
