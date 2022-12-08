package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class AddDaysAdjusterTest {
    static Stream<Arguments> provideArgumentsForDaysAdjuster() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), 15, LocalDate.of(2012, 10, 30)),
                Arguments.of(LocalDate.of(2012, 10, 15), 20, LocalDate.of(2012, 11, 4)),
                Arguments.of(LocalDate.of(2012, 10, 15), 365, LocalDate.of(2013, 10, 15))
        );
    }

    @ParameterizedTest(name = "DaysAdjuster")
    @MethodSource("provideArgumentsForDaysAdjuster")
    void testAdjustInto(LocalDate date, int days, LocalDate expected) {
        LocalDate actual = date.with(new AddDaysAdjuster(days));

        Assertions.assertEquals(expected, actual);
    }
}
