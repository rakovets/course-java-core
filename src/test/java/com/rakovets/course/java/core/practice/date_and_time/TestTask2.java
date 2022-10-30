package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class TestTask2 {
    Task2 task = new Task2();

    static Stream<Arguments> provideArgumentsForGetDatePlusDays() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), 15, LocalDate.of(2012, 10, 30)),
                Arguments.of(LocalDate.of(2012, 10, 15), 20, LocalDate.of(2012, 11, 4)),
                Arguments.of(LocalDate.of(2012, 10, 15), 365, LocalDate.of(2013, 10, 15))
        );
    }

    @ParameterizedTest(name = "GetDatePlusDays")
    @MethodSource("provideArgumentsForGetDatePlusDays")
    void testGetLocalDate(LocalDate date, int days, LocalDate expected) {
        LocalDate actual = task.getDatePlusDays(date, days);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetNearestFirstJanuary() {
        return Stream.of(
                Arguments.of(LocalDate.of(2012, 10, 15), LocalDate.of(2013, 1, 1)),
                Arguments.of(LocalDate.of(2012, 1, 15), LocalDate.of(2012, 1, 1)),
                Arguments.of(LocalDate.of(2012, 6, 15), LocalDate.of(2012, 1, 1))
        );
    }

    @ParameterizedTest(name = "GetNearestFirstJanuary")
    @MethodSource("provideArgumentsForGetNearestFirstJanuary")
    void testGetLocalDateAfterSomeMonth(LocalDate date, LocalDate expected) {
        LocalDate actual = task.getNearestFirstJanuary(date);

        Assertions.assertEquals(expected, actual);
    }

}
