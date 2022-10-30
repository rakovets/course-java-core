package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TestTask1 {
    Task1 task = new Task1();

    static Stream<Arguments> provideArgumentsForGetLocalDate() {
        return Stream.of(
                Arguments.of(2012, 10, 15, LocalDate.of(2012, 10, 15)),
                Arguments.of(2022, 10, 28, LocalDate.of(2022, 10, 28)),
                Arguments.of(1999, 5, 28, LocalDate.of(1999, 5, 28))
        );
    }

    @ParameterizedTest(name = "GetLocalDate")
    @MethodSource("provideArgumentsForGetLocalDate")
    void testGetLocalDate(int year, int month, int day, LocalDate expected) {
        LocalDate actual = task.getLocalDate(year, month, day);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDateAfterSomeMonth() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), 15, LocalDate.of(2014, 1, 15)),
                Arguments.of(LocalDate.of(2012, 10, 15), 1, LocalDate.of(2012, 11, 15)),
                Arguments.of(LocalDate.of(2012, 10, 15), 24, LocalDate.of(2014, 10, 15))
        );
    }

    @ParameterizedTest(name = "GetLocalDateAfterSomeMonth")
    @MethodSource("provideArgumentsForGetLocalDateAfterSomeMonth")
    void testGetLocalDateAfterSomeMonth(LocalDate date, int month, LocalDate expected) {
        LocalDate actual = task.getLocalDateAfterSomeMonth(date, month);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFormattedDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), "dd.MM.yyyy", "15.10.2012"),
                Arguments.of(LocalDate.of(2012, 10, 15), "dd MMMM yyyy", "15 октября 2012"),
                Arguments.of(LocalDate.of(2012, 10, 15), "dd MMM yy'г.'", "15 окт. 12г.")
        );
    }

    @ParameterizedTest(name = "GetFormattedDate")
    @MethodSource("provideArgumentsForGetFormattedDate")
    void testGetFormattedDate(LocalDate date, DateTimeFormatter dtf, String expected) {
        String actual = task.getFormattedDate(date, dtf);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetDateFromString() {
        return Stream.of(
                Arguments.of("15.10.2012", "dd.MM.yyyy", LocalDate.of(2012, 10, 15)),
                Arguments.of("15 октября 2012", "dd MMMM yyyy", LocalDate.of(2012, 10, 15)),
                Arguments.of("15 окт. 12г.", "dd MMM yy'г.'", LocalDate.of(2012, 10, 15))
        );
    }

    @ParameterizedTest(name = "GetDateFromString")
    @MethodSource("provideArgumentsForGetDateFromString")
    void testGetDateFromString(String str, DateTimeFormatter dtf, LocalDate expected) {
        LocalDate actual = task.getDateFromString(str, dtf);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetDaysBetweenDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 23), LocalDate.of(2012, 10, 13), 10),
                Arguments.of(LocalDate.of(2012, 10, 15), LocalDate.of(2012, 10, 25), 10),
                Arguments.of(LocalDate.of(2013, 10, 15), LocalDate.of(2012, 10, 25), 355),
                Arguments.of(LocalDate.of(2012, 10, 15), LocalDate.of(2012, 12, 15), 61)
        );
    }

    @ParameterizedTest(name = "GetDateDaysBetweenDates")
    @MethodSource("provideArgumentsForGetDaysBetweenDates")
    void testGetDaysBetweenDates(LocalDate date1, LocalDate date2, long expected) {
        long actual = task.getDaysBetweenDates(date1, date2);

        Assertions.assertEquals(expected, actual);
    }
}
