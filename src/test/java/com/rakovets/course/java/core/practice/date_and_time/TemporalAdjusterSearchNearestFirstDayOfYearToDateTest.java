package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.TemporalAdjusterSearchNearestFirstDayOfYearToDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.stream.Stream;

public class TemporalAdjusterSearchNearestFirstDayOfYearToDateTest {
    TemporalAdjusterSearchNearestFirstDayOfYearToDate dateWrapper =
            new TemporalAdjusterSearchNearestFirstDayOfYearToDate();

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
    void testSearchNearestFirstDayOfYearToDate(Temporal temporal, String expected) {
        Temporal actual = dateWrapper.adjustInto(temporal);

        Assertions.assertEquals(expected, actual.toString());
    }
}
