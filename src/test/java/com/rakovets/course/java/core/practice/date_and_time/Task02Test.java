package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task02Test {
    static Stream<Arguments> provideArgumentsAddDaysToDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(1999, 9, 10), 100,
                        LocalDate.of(1999, 12, 19)),
                Arguments.of(LocalDate.of(2022, 10, 30), 3,
                        LocalDate.of(2022, 11, 2)),
                Arguments.of(LocalDate.of(2000, 2, 8), 1200,
                        LocalDate.of(2003, 5, 23))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAddDaysToDate")
    void testAddDaysToDate(LocalDate date, int days, LocalDate expected) {
        Task02 task02 = new Task02(days);

        LocalDate actual = (LocalDate) task02.adjustInto(date);

        assertEquals(expected, actual);
    }
}
