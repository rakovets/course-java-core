package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ChangeDateFirstDayOfYearTest {
    static Stream<Arguments> provideArgumentsForChangeDateFirstDayOfYear() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), LocalDate.of(2013, 1, 1)),
                Arguments.of(LocalDate.of(2012, 1, 15), LocalDate.of(2012, 1, 1)),
                Arguments.of(LocalDate.of(2012, 6, 15), LocalDate.of(2012, 1, 1))
        );
    }

    @ParameterizedTest(name = "ChangeDateFirstDayOfYear")
    @MethodSource("provideArgumentsForChangeDateFirstDayOfYear")
    void testAdjustInto(LocalDate date, LocalDate expected) {
        LocalDate actual = date.with(new ChangeDateFirstDayOfYear());

        Assertions.assertEquals(expected, actual);
    }
}
