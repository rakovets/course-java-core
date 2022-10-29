package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateWrapperTask01Tests {
    static Stream<Arguments> provideArgumentsGetLocalDate() {
        return Stream.of(
                Arguments.of(2000, 1, 1, "2000-01-01"),
                Arguments.of(2022, 12, 24, "2022-12-24"),
                Arguments.of(3050, 9, 8, "3050-09-08")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetLocalDate")
    void testGetLocalDate(int year, int month, int day, LocalDate expected) {
        DateWrapperTask01 dateNew = new DateWrapperTask01();

        LocalDate actual = dateNew.getLocalDate(year, month, day);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetShiftByMonth() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1), 3, "2000-04-01"),
                Arguments.of(LocalDate.of(2022, 12, 24), 5, "2023-05-24"),
                Arguments.of(LocalDate.of(3050, 9, 8), 7, "3051-04-08")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetShiftByMonth")
    void testGetShiftByMonth(LocalDate date, int shiftMonth, LocalDate expected) {
        DateWrapperTask01 dateNew = new DateWrapperTask01();

        LocalDate actual = dateNew.getShiftByMonth(date, shiftMonth);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetStringDateChangeByPattern() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1), "yyyy-dd MMMM", "2000-01 января"),
                Arguments.of(LocalDate.of(2022, 12, 24), "MMMM dd YYYY", "декабря 24 2022"),
                Arguments.of(LocalDate.of(3050, 9, 8), "dd yyyy-MMMM", "08 3050-сентября")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetStringDateChangeByPattern")
    void testGetStringDateChangeByPattern(LocalDate date, DateTimeFormatter formatter, String expected) {
        DateWrapperTask01 dateNew = new DateWrapperTask01();

        String actual = dateNew.getStringDateChangeByPattern(date, formatter);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetLocalDateChangeByPattern() {
        return Stream.of(
                Arguments.of("December 11 1990", "MMMM d yyyy", "1990-12-11"),
                Arguments.of("05 25 2030", "MM d yyyy", "2030-05-25"),
                Arguments.of("08 17 June", "dd yy MMMM", "2017-06-08")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetLocalDateChangeByPattern")
    void testGetLocalDateChangeByPattern(String date, DateTimeFormatter formatter, LocalDate expected) {
        DateWrapperTask01 dateNew = new DateWrapperTask01();

        LocalDate actual = dateNew.getLocalDateChangeByPattern(date, formatter);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTimeBetweenDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1),
                        LocalDate.of(2001, 3, 5), 429),
                Arguments.of(LocalDate.of(2022, 12, 24),
                        LocalDate.of(2030, 2, 12), 2607),
                Arguments.of(LocalDate.of(3050, 9, 8),
                        LocalDate.of(3050, 9, 9), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTimeBetweenDates")
    void testGetTimeBetweenDates(LocalDate dateStart, LocalDate dateEnd, int expected) {
        DateWrapperTask01 dateNew = new DateWrapperTask01();

        int actual = dateNew.getTimeBetweenDates(dateStart, dateEnd);

        assertEquals(expected, actual);
    }
}
