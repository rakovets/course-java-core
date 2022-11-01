package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task02_2Test {
    static Stream<Arguments> provideArgumentsFirstJanuary() {
        return Stream.of(
                Arguments.of(LocalDate.of(1999, 9, 10),
                        LocalDate.of(2000, 1, 1)),
                Arguments.of(LocalDate.of(2022, 10, 30),
                        LocalDate.of(2023, 1, 1)),
                Arguments.of(LocalDate.of(2000, 2, 8),
                        LocalDate.of(2000, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFirstJanuary")
    void testFirstJanuary(LocalDate date, LocalDate expected) {
        Task02_2 task02_2 = new Task02_2();

        LocalDate actual = (LocalDate) task02_2.adjustInto(date);

        assertEquals(expected, actual);
    }
}
