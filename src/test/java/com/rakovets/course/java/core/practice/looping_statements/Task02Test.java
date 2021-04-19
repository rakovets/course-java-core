package com.rakovets.course.java.core.practice.looping_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Deposit")
class Task02Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(10000.0, 18.0, 5, 22877.58),
                Arguments.of(10000.0, 50.0, 9, 384433.59),
                Arguments.of(10000.0, 7.0, 7, 16057.81),
                Arguments.of(10000.0, 4.0, 8, 13685.69),
                Arguments.of(10000.0, 1.0, 10, 11046.22),
                Arguments.of(10000.0, 3.0, 15, 15579.67)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(double depositAmount, double annualDepositPercent, int depositTerm, double expected) {
        double actual = Task02.getTotalDepositAmount(depositAmount, annualDepositPercent, depositTerm);

        assertEquals(expected, actual);
    }
}
