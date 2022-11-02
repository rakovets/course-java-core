package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.TemporalAdjuster.Task2Part2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Task2Part2Test {
    static Stream<Arguments> provideArgsForTask2Part2() {
        return Stream.of(
                Arguments.of(LocalDate.of(2017,7,3), LocalDate.of(2018,1,1)),
                Arguments.of(LocalDate.of(2018,12,11), LocalDate.of(2019,1,1)),
                Arguments.of(LocalDate.of(2020,2,24),LocalDate.of(2020,1,1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForTask2Part2")
    void getTask2Part2(LocalDate localDate,LocalDate expected) {
        Task2Part2 task2Part2 = new Task2Part2();

        LocalDate actual = (LocalDate) task2Part2.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }
}
