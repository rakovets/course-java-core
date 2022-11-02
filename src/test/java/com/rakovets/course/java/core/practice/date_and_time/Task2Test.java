package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.TemporalAdjuster.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Task2Test {
    static Stream<Arguments> provideArgsForTask2() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022,11,01), 24, LocalDate.of(2022,11,25)),
                Arguments.of(LocalDate.of(2017,1,5), 155, LocalDate.of(2017,6,9)),
                Arguments.of(LocalDate.of(2016,01,01), 375, LocalDate.of(2017,01,10))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForTask2")
    void getTask2(LocalDate localDate, int days, LocalDate expected) {
        Task2 task2 = new Task2(days);
        LocalDate actual = (LocalDate) task2.adjustInto(localDate);
        Assertions.assertEquals(expected, actual);
    }
}
