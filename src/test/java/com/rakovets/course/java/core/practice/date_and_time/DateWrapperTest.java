package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {

    @Test
    void getLocalDate() {
        // GIVEN

        // WHEN
        LocalDate actualDate = DateWrapper.getLocalDate(2021, 5, 3);

        // THEN
        Assertions.assertEquals(LocalDate.of(2021, 5, 3), actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDateAfterMonth() {
        return Stream.of(
                Arguments.of("2020-07-23", 5, LocalDate.of(2020, 2, 23)),
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
                Arguments.of("23-Feb-2021", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2021", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2021", "dd.MM.yyyy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFormatDateToString")
    void formatDateToString(String expectedString, String pattern) {
        // GIVEN
        LocalDate test = LocalDate.of(2021, 2, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        // WHEN
        String actualString = DateWrapper.formatDateToString(test, formatter);

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> provideArgumentsForParseStringToDate() {
        return Stream.of(
                Arguments.of("23-Feb-2021", "dd-MMM-yyyy"),
                Arguments.of("February, 23, 2021", "MMMM, dd, yyyy"),
                Arguments.of("23.02.2021", "dd.MM.yyyy")
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
        Assertions.assertEquals(LocalDate.of(2021, 2, 23), actualDate);
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
}
