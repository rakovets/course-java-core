package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class MathTest<T> {
    private final Integer[] integerNumbersArray = new Integer[]{0, 25, 50, 0, 5, 10, -50, -25, -50, 0, -5, -10};
    private final Double[] doubleNumbersArray = new Double[]{0.0, 25.0, 0.0, 5.0, 50.0, 10.0, -50.0, -25.0, 0.0, -5.0, -50.0, -10.0};

    @ParameterizedTest
    @MethodSource("getMaxFromThreeNumbersTest")
    public void getMaxFromThreeNumbersTest(Number expectedResult, Number firstArg, Number secondArg, Number thirdArg) {
        Number maxNumber = Math.getMaxFromThreeNumbers(firstArg, secondArg, thirdArg);

        Assertions.assertEquals(expectedResult, maxNumber);
    }

    @ParameterizedTest
    @MethodSource("getMinFromFiveNumbersTest")
    public void getMinFromFiveNumbersTest(
            Number expectedResult, Number firstArg, Number secondArg, Number thirdArg, Number fourthArg, Number fifthArg) {
        Number minNumber = Math.getMinFromFiveNumbers(firstArg, secondArg, thirdArg, fourthArg, fifthArg);

        Assertions.assertEquals(expectedResult, minNumber);
    }

    @Test
    public void getArithmeticMeanIntegerTest() {
        double actualResult = Math.getArithmeticMean(integerNumbersArray);
        double expectedResult = -4.166666666666667;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getArithmeticMeanDoubleTest() {
        double actualResult = Math.getArithmeticMean(doubleNumbersArray);
        double expectedResult = -4.166666666666667;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMaxFromArrayIntegerTest() {
        double actualResult = Math.getMaxFromArray(integerNumbersArray);
        double expectedResult = 50;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMaxFromArrayDoubleTest() {
        double actualResult = Math.getMaxFromArray(doubleNumbersArray);
        double expectedResult = 50;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMinFromArrayIntegerTest() {
        double actualResult = Math.getMinFromArray(integerNumbersArray);
        double expectedResult = -50;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMinFromArrayDoubleTest() {
        double actualResult = Math.getMinFromArray(doubleNumbersArray);
        double expectedResult = -50;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getBubbleSortArrayIntegerTest() {
        Integer[] actualResult = Math.getBubbleSortArray(integerNumbersArray);
        Arrays.sort(integerNumbersArray);

        Assertions.assertEquals(integerNumbersArray, actualResult);
    }

    @Test
    public void getBubbleSortArrayDoubleTest() {
        Double[] actualResult = Math.getBubbleSortArray(doubleNumbersArray);
        Arrays.sort(integerNumbersArray);

        Assertions.assertEquals(doubleNumbersArray, actualResult);
    }

    @Test
    public void findIndexOfNumberTest() {
        int desiredNumber = 5;
        Integer actualResult = Math.findIndexOfNumber(integerNumbersArray, desiredNumber);
        int expectedResult = Arrays.binarySearch(integerNumbersArray, desiredNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> getMaxFromThreeNumbersTest() {
        return Stream.of(
                Arguments.of(50, 50, 0, 5),
                Arguments.of(50.0, 0.0, 5.0, 50.0),
                Arguments.of(0, -50, 0, -10),
                Arguments.of(0.0, -10.0, 0.0, -50.0)
        );
    }

    private static Stream<Arguments> getMinFromFiveNumbersTest() {
        return Stream.of(
                Arguments.of(0, 25, 50, 0, 5, 10),
                Arguments.of(0.0, 25.0, 0.0, 5.0, 50.0, 10.0),
                Arguments.of(-50, -25, -50, 0, -5, -10),
                Arguments.of(-50.0, -25.0, 0.0, -5.0, -50.0, -10.0)
        );
    }
}
