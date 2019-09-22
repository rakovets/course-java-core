package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task05Test extends ConsoleTest {
    static Stream<Arguments> monthsProvider() {
        return Stream.of(
                Arguments.of("1", Month.JANUARY),
                Arguments.of("2", Month.FEBRUARY),
                Arguments.of("3", Month.MARCH),
                Arguments.of("4", Month.APRIL),
                Arguments.of("5", Month.MAY),
                Arguments.of("6", Month.JUNE),
                Arguments.of("7", Month.JULY),
                Arguments.of("8", Month.AUGUST),
                Arguments.of("9", Month.SEPTEMBER),
                Arguments.of("10", Month.OCTOBER),
                Arguments.of("11", Month.NOVEMBER),
                Arguments.of("12", Month.DECEMBER)
        );
    }

    @ParameterizedTest(name = "Month number: {0}")
    @MethodSource("monthsProvider")
    @DisplayName("Month converter")
    void test(String monthNumber, Month expected) {
        Task05.main(new String[]{monthNumber});
        assertEquals(getConsoleContent(), expected.toString());
    }
}