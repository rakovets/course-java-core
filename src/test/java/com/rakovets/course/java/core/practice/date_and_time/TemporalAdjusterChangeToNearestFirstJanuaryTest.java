package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemporalAdjusterChangeToNearestFirstJanuaryTest {
    static Stream<Arguments> provideArgumentsNearestFirstJanuary() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 3, 2),
                        LocalDate.of(2000, 1, 1)),
                Arguments.of(LocalDate.of(2022, 12, 24),
                        LocalDate.of(2023, 1, 1)),
                Arguments.of(LocalDate.of(3050, 9, 8),
                        LocalDate.of(3051, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNearestFirstJanuary")
    void testNearestFirstJanuary(LocalDate date, LocalDate expected) {
        TemporalAdjusterChangeToNearestFirstJanuary temporal = new TemporalAdjusterChangeToNearestFirstJanuary();

        LocalDate actual = (LocalDate) temporal.adjustInto(date);

        assertEquals(expected, actual);
    }
}
