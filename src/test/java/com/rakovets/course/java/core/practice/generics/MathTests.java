package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.example.generics.model.restrict.D;
import com.rakovets.course.java.core.practice.generics.project_math.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTests {
    static Stream<Arguments> provideArgumentsGetMaximumFromThreeParametersInteger() {
        return Stream.of(
                Arguments.of(15, 2, 7, 15),
                Arguments.of(7, 22, 3, 22),
                Arguments.of(1, 12, 23, 23),
                Arguments.of(1, 3, 3, 3)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMaximumFromThreeParametersInteger")
    public void testGetMaximumFromThreeParameters(Integer t1, Integer t2, Integer t3, Integer expected) {
        Integer actual = Math.getMaximumFromThreeParameters(t1, t2, t3);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetMaximumFromThreeParametersDouble() {
        return Stream.of(
                Arguments.of(1.2, 1.5, 5.8, 5.8),
                Arguments.of(11.2, 1.5, 5.8, 11.2),
                Arguments.of(1.2, 11.5, 5.8, 11.5),
                Arguments.of(1.2, 5.8, 5.8, 5.8)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMaximumFromThreeParametersDouble")
    public void testGetMaximumFromThreeParameters(Double t1, Double t2, Double t3, Double expected) {
        Double actual = Math.getMaximumFromThreeParameters(t1, t2, t3);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetMinFromFiveParametersDouble() {
        return Stream.of(
                Arguments.of(1.2, 1.5, 5.8, 5.8, 0.0, 0.0),
                Arguments.of(11.2, 1.5, 5.8, 11.2, 1.0, 1.0),
                Arguments.of(1.2, 11.5, 5.8, 11.5, 22.3, 1.2),
                Arguments.of(9.2, 5.8, 5.8, 5.8, 0.0, 0.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMinFromFiveParametersDouble")
    public void testGetMinFromFiveParametersDouble(Double t1, Double t2, Double t3, Double t4, Double t5, Double expected) {
        Double actual = Math.getMinFromFiveParameters(t1, t2, t3, t4, t5);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetMinFromFiveParametersInteger() {
        return Stream.of(
                Arguments.of(1, 1, 5, 5, 0, 0),
                Arguments.of(1, 1, 5, 5, 10, 1),
                Arguments.of(1, 1, 5, 15, 0, 0),
                Arguments.of(1, 1, 5, 5, 20, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsGetMinFromFiveParametersInteger")
    public void testGetMinFromFiveParametersInteger(Integer t1, Integer t2, Integer t3, Integer t4, Integer t5, Integer expected) {
        Integer actual = Math.getMinFromFiveParameters(t1, t2, t3, t4, t5);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMaxArrayValueDouble() {
        return Stream.of(
                Arguments.of(1.1, 2.1, 3.1, 3.1),
                Arguments.of(11.5, 2.5, 3.5, 11.5),
                Arguments.of(1.2, 12.2, 3.2, 12.2),
                Arguments.of(1.8, 3.8, 3.8, 3.8)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxArrayValueDouble")
    public void testGetMaxArrayValueDouble(Double t1, Double t2, Double t3, Double expected) {
        Double actual = Math.getMaxArrayValue(new Double[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMaxArrayValueInteger() {
        return Stream.of(
                Arguments.of(1, 2, 3, 3),
                Arguments.of(11, 2, 3, 11),
                Arguments.of(1, 12, 3, 12),
                Arguments.of(1, 3, 3, 3)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMaxArrayValueInteger")
    public void testGetMaxArrayValueInteger(Integer t1, Integer t2, Integer t3, Integer expected) {
        Integer actual = Math.getMaxArrayValue(new Integer[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinArrayValueDouble() {
        return Stream.of(
                Arguments.of(1.1, 2.1, 3.1, 1.1),
                Arguments.of(11.5, 2.5, 3.5, 2.5),
                Arguments.of(1.2, 12.2, 3.2, 1.2),
                Arguments.of(1.8, 3.8, 3.8, 1.8)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinArrayValueDouble")
    public void testGetMinArrayValueDouble(Double t1, Double t2, Double t3, Double expected) {
        Double actual = Math.getMinArrayValue(new Double[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMinArrayValueInteger() {
        return Stream.of(
                Arguments.of(1, 2, 3, 1),
                Arguments.of(11, 2, 3, 2),
                Arguments.of(1, 12, 3, 1),
                Arguments.of(1, 3, 3, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMinArrayValueInteger")
    public void testGetMinArrayValueInteger(Integer t1, Integer t2, Integer t3, Integer expected) {
        Integer actual = Math.getMinArrayValue(new Integer[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAverageValueOfArrayDouble() {
        return Stream.of(
                Arguments.of(1.1, 2.1, 3.1, 2.1),
                Arguments.of(11.5, 2.5, 3.5, 5.83),
                Arguments.of(1.2, 12.2, 3.2, 5.53),
                Arguments.of(1.8, 3.8, 3.8, 3.13)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageValueOfArrayDouble")
    public void testGGetAverageValueOfArrayDouble(Double t1, Double t2, Double t3, Double expected) {
        Double actual = Math.getAverageValueOfArray(new Double[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual, 0.01 );
    }

    static Stream<Arguments> provideArgumentsForGetAverageValueOfArrayInteger() {
        return Stream.of(
                Arguments.of(1, 2, 3, 2.0),
                Arguments.of(2, 2, 3, 2.33),
                Arguments.of(1, 12, 3, 5.33),
                Arguments.of(1, 43, 3, 15.66)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAverageValueOfArrayInteger")
    public void testGGetAverageValueOfArrayInteger(Integer t1, Integer t2, Integer t3, Double expected) {
        Double actual = Math.getAverageValueOfArray(new Integer[]{t1, t2, t3});

        Assertions.assertEquals(expected, actual, 0.01 );
    }
}
