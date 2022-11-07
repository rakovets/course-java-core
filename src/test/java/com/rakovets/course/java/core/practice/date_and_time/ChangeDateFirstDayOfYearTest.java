package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ChangeDateFirstDayOfYearTest {
    static Stream<Arguments> changeDateFirstDayOfYearArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 11, 3), LocalDate.of(2023, 1, 1)),
                Arguments.of(LocalDate.of(2034, 12, 3), LocalDate.of(2035, 1, 1)),
                Arguments.of(LocalDate.of(1999, 2, 1), LocalDate.of(1999, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("changeDateFirstDayOfYearArguments")
    public void adjustInto(LocalDate localDate, LocalDate expected) {
        LocalDate actual = localDate.with(new ChangeDateFirstDayOfYear());

        Assertions.assertEquals(expected, actual);
    }
}
