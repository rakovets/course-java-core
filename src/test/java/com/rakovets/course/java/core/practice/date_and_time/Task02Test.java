package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.stream.Stream;

public class Task02Test {
    Task02 dateWrapper = new Task02();

    static Stream<Arguments> provideArgumentsForDaysAddDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(1991, 12, 12), 20, "1992-01-01"),
                Arguments.of(LocalDate.of(1643, 1, 7), 200, "1643-07-26"),
                Arguments.of(LocalDate.of(1888, 6, 6), 2000, "1893-11-27"),
                Arguments.of(LocalDate.of(2022, 10, 25), 456, "2024-01-24"),
                Arguments.of(LocalDate.of(2073, 7, 30), 14, "2073-08-13")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDaysAddDate")
    void testDaysAddDate(LocalDate date, int numberDays, String expected) {
        Temporal actual = dateWrapper.daysAddDate(date, numberDays);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForSearchNearestFirstDayOfYearToDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(1991, 12, 12), "1992-01-01"),
                Arguments.of(LocalDate.of(1643, 1, 7), "1643-01-01"),
                Arguments.of(LocalDate.of(1888, 6, 6), "1888-01-01"),
                Arguments.of(LocalDate.of(2022, 10, 25), "2023-01-01"),
                Arguments.of(LocalDate.of(2073, 7, 30), "2074-01-01")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSearchNearestFirstDayOfYearToDate")
    void testSearchNearestFirstDayOfYearToDate(LocalDate date, String expected) {
        Temporal actual = dateWrapper.searchNearestFirstDayOfYearToDate(date);

        Assertions.assertEquals(expected, actual.toString());
    }
}
