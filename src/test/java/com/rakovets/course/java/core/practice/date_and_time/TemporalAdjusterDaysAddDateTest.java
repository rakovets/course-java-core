package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.TemporalAdjusterDaysAddDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.stream.Stream;

public class TemporalAdjusterDaysAddDateTest {
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
    void testDaysAddDate(Temporal temporal, int numberDays, String expected) {
        TemporalAdjusterDaysAddDate dateWrapper = new TemporalAdjusterDaysAddDate(numberDays);

        Temporal actual = dateWrapper.adjustInto(temporal);

        Assertions.assertEquals(expected, actual.toString());
    }
}
