package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class TestTask02 {
    Task02 localDateTimeConverter = new Task02();

    static Stream<Arguments> provideArgumentsAddDaysToLocalDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1), 0, "2000-01-01"),
                Arguments.of(LocalDate.of(2000, 1, 1), 366, "2001-01-01")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAddDaysToLocalDate")
    void testAddDaysToLocalDate(LocalDate localDate, long days, String expected) {
        LocalDate actual = localDateTimeConverter.addDaysToLocalDate(localDate, days);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsChangeLocalDateToJanuary() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 2, 1), "2000-01-01"),
                Arguments.of(LocalDate.of(2000, 7, 1), "2001-01-01")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsChangeLocalDateToJanuary")
    void testChangeLocalDateToJanuary(LocalDate localDate, String expected) {
        LocalDate actual = localDateTimeConverter.changeLocalDateToJanuary(localDate);

        Assertions.assertEquals(expected, actual.toString());
    }
}
