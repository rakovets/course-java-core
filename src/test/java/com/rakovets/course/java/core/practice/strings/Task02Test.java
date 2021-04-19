package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Task02.
 *
 * @author Dmitry Rakovets
 */
@DisplayName("Money")
@SuppressWarnings("unused")
class Task02Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("since the 1500s when  of type11$ and remaining 10$  12$ essentially 13$ unchanged. the 1960s with  Lorem",
                        new double[]{10, 12, 13}, 35.0),
                Arguments.of("the 1500s when only$12$ five c but 10.51$ also  12 into types11etting  unchanged. 12.49$ It the 1960s with",
                        new double[]{10.51, 12.49}, 23.0),
                Arguments.of(" since the 1500s when into 100$ elect100$ronic  remaining -12$ essentiall the 1960s with the release",
                        new double[]{100, -12}, 88.0),
                Arguments.of("the 1960s with the ", new double[]{}, 0.0),
                Arguments.of("typetypesetting 100$ -12$remaining the 1960s with -12$ the release -36$ of Letraset Lorem",
                        new double[]{100, -12, -36}, 52.0)
        );
    }


    @ParameterizedTest(name = "Get list for money: {1}")
    @MethodSource("provideArguments")
    void getArrayMoneyFromReportTest(String report, double[] arrayMoney, double sumMoney) {
        double[] actual = Task02.getArrayMoneyFromReport(report);

        assertArrayEquals(actual, arrayMoney);
    }

    @ParameterizedTest(name = "Get sum for money: {2}")
    @MethodSource("provideArguments")
    void getSumMoneyFromReportTest(String report, double[] arrayMoney, double sumMoney) {
        double actual = Task02.getSumMoneyFromReport(report);

        assertEquals(actual, sumMoney);
    }
}
