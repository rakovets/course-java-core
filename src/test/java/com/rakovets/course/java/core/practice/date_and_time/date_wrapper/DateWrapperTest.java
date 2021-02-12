package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {

    @Test
    void getLocalDate() {
        // GIVEN

        // WHEN
        LocalDate actualDate = DateWrapper.getLocalDate(2020, 10, 23);

        // THEN
        Assertions.assertEquals("2020-10-23", actualDate.toString());
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
        LocalDate actualDate = DateWrapper.getLocalDateAfterMonth(test, month);

        // THEN
        Assertions.assertEquals(expectedString, actualDate.toString());
    }

    static Stream<Arguments> provideArgumentsForFormatLocalDate() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFormatLocalDate")
    void formatLocalDate(String expectedString, String pattern) {
        // GIVEN
        LocalDate test = LocalDate.of(2020, 2, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        // WHEN
       String actualString = DateWrapper.formatLocalDate(test, formatter);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForParseStringToLocalDate() {
        return Stream.of(
                Arguments.of("23-Feb-2020", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2020", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2020", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForParseStringToLocalDate")
    void parseStringToLocalDate(String string, String pattern) {
        // GIVEN
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        // WHEN
        LocalDate actualDate = DateWrapper.parseStringToLocalDate(string, formatter);

        // THEN
        Assertions.assertEquals("2020-02-23", actualDate.toString());
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
}
