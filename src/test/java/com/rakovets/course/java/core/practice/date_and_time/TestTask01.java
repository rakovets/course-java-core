package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TestTask01 {
    Task01 localDateTimeConverter = new Task01();

    static Stream<Arguments> provideArgumentsReturnLocalDate() {
        return Stream.of(
                Arguments.of(2022, 10, 29, "2022-10-29"),
                Arguments.of(1900, 12, 1, "1900-12-01"),
                Arguments.of(2777, 01, 7, "2777-01-07")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsReturnLocalDate")
    void testReturnLocalDate(int year, int month, int day, String expected) {
        LocalDate actual = localDateTimeConverter.returnLocalDate(year, month, day);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsIncreaseLocalDateByInputMonth() {
        return Stream.of(
                Arguments.of(LocalDate.of(1900, 1, 15), 1, "1900-02-15"),
                Arguments.of(LocalDate.of(2000, 1, 11), 0, "2000-01-11"),
                Arguments.of(LocalDate.of(2300, 1, 11), 35, "2302-12-11")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsIncreaseLocalDateByInputMonth")
    void testIncreaseLocalDateByInputMonth(LocalDate localDate, long month, String expected) {
        LocalDate actual = localDateTimeConverter.increaseLocalDateByInputMonth(localDate, month);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsChangeLocalDateByPattern() {
        return Stream.of(
                Arguments.of(LocalDate.of(1900, 1, 15),
                        DateTimeFormatter.ofPattern("MM/dd/yyyy"),
                        "01/15/1900"),
                Arguments.of(LocalDate.of(2000, 5, 10),
                        DateTimeFormatter.ofPattern("MMMM dd, yyyy"),
                        "мая 10, 2000"),
                Arguments.of(LocalDate.of(2300, 3, 6),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                        "2300-03-06")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsChangeLocalDateByPattern")
    void testChangeLocalDateByPattern(LocalDate localDate, DateTimeFormatter formatter, String expected) {
        String actual = localDateTimeConverter.changeLocalDateByPattern(localDate, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsReturnLocalDateByPattern() {
        return Stream.of(
                Arguments.of("2300-03-06", DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                        "2300-03-06"),
                Arguments.of("мая 10, 2000", DateTimeFormatter.ofPattern("MMMM dd, yyyy"),
                        "2000-05-10")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsReturnLocalDateByPattern")
    void testReturnLocalDateByPattern(String initial, DateTimeFormatter formatter, String expected) {
        LocalDate actual = localDateTimeConverter.returnLocalDateByPattern(initial, formatter);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsCountDaysBetweenLocalDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1),
                        LocalDate.of(2000, 12, 31), 365),
                Arguments.of(LocalDate.of(2000, 1, 1),
                        LocalDate.of(2001, 12, 31), 730),
                Arguments.of(LocalDate.of(2000, 1, 1),
                        LocalDate.of(2000, 1, 1), 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsCountDaysBetweenLocalDates")
    void testCountDaysBetweenLocalDates(LocalDate localDateBeginning, LocalDate localDateEnding, long expected) {
        long actual = localDateTimeConverter.countDaysBetweenLocalDates(localDateEnding, localDateBeginning);

        Assertions.assertEquals(expected, actual);
    }
}
