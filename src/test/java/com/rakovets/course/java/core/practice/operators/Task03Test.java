package com.rakovets.course.java.core.practice.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Deposit in Bank")
class Task03Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1501, 5, 7, 2026.35f),
                Arguments.of(0, 15, 100, 0.0f),
                Arguments.of(10000, 5, 0, 10000.0f),
                Arguments.of(100, 5, 100, 600.0f)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest(name = "Deposit. Amount: {0}, years: {1}, annual percentage: {2}")
    void testGetTotalDepositAmount(int depositAmount, int depositYears, int depositAnnualPercentage, float expected) {
        float actual = Task03.getTotalDepositAmount(depositAmount, depositYears, depositAnnualPercentage);

        assertEquals(expected, actual);
    }
}
