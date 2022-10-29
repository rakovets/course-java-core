package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemporalAdjusterAddDaysToDateTest {
    static Stream<Arguments> provideArgumentsAddDaysToDate() {
        return Stream.of(
                Arguments.of(LocalDate.of(2000, 1, 1), 100,
                        LocalDate.of(2000, 4, 10)),
                Arguments.of(LocalDate.of(2022, 12, 24), 6,
                        LocalDate.of(2022, 12, 30)),
                Arguments.of(LocalDate.of(3050, 9, 8), 73,
                        LocalDate.of(3050, 11, 20))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAddDaysToDate")
    void testAddDaysToDate(LocalDate date, int addDays, LocalDate expected) {
        TemporalAdjusterAddDaysToDate temporal = new TemporalAdjusterAddDaysToDate(addDays);

        LocalDate actual = (LocalDate) temporal.adjustInto(date);

        assertEquals(expected, actual);
    }
}
