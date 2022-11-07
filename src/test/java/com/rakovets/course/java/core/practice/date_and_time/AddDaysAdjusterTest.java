package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class AddDaysAdjusterTest {
    static Stream<Arguments> addDaysAdjusterArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 11, 3), 6, LocalDate.of(2022, 11, 9)),
                Arguments.of(LocalDate.of(2034, 12, 3), 31, LocalDate.of(2035, 1, 3)),
                Arguments.of(LocalDate.of(1999, 1, 1), 355, LocalDate.of(1999, 12, 22))
        );
    }

    @ParameterizedTest
    @MethodSource("addDaysAdjusterArguments")
    public void adjustInto(LocalDate localDate, int days, LocalDate expected) {
        LocalDate actual = localDate.with(new AddDaysAdjuster(days));

        Assertions.assertEquals(expected, actual);
    }
}
