package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TvTest {
    static List<TV> tv = Arrays.asList(
            new TV("Sony", "1A", 2021, 43, 800.0),
            new TV("Sony", "2A", 2020, 23, 150.0),
            new TV("LG", "8H", 2021, 43, 600.0),
            new TV("LG", "7Н", 2020, 34, 400.0),
            new TV("LG", "2Н", 2018, 23, 145.0),
            new TV("Samsung", "3CC", 2021, 43, 1250.0),
            new TV("Panasonic", "4DD", 2020, 52, 1250.0),
            new TV("Philips", "2EE", 2021, 43, 700.0));


    @Test
    static Stream<Arguments> specificDiagonalTestProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(1), tv.get(4)), 23),
                Arguments.of(Arrays.asList(tv.get(3)), 34)
        );
    }

    @ParameterizedTest
    @MethodSource("specificDiagonalTestProviderArguments")
    public void specificDiagonalTest(List<TV> expected, int diagonal) {
        List<TV> actual = TvFilter.specificDiagonal(tv, diagonal);
        assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> specificManufacturerTestProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(0), tv.get(1)), "Sony"),
                Arguments.of(Arrays.asList(tv.get(5)), "Samsung")
        );
    }

    @ParameterizedTest
    @MethodSource("specificManufacturerTestProviderArguments")
    public void specificManufacturerTest(List<TV> expected, String manufacturer) {
        List<TV> actual = TvFilter.specificManufacturer(tv, manufacturer);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    static Stream<Arguments> underSpecialYearProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(4)), 2018),
                Arguments.of(Arrays.asList(tv.get(1), tv.get(3), tv.get(4), tv.get(6)), 2020)
        );
    }

    @ParameterizedTest
    @MethodSource("underSpecialYearProviderArguments")
    public void underSpecialYearTest(List<TV> expected, int year) {
        List<TV> actual = TvFilter.underSpecialYear(tv, year);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    static Stream<Arguments> specificPriseProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(2), tv.get(7)), 550.0, 750.0),
                Arguments.of(Arrays.asList(tv.get(5), tv.get(6)), 1200.0, 1300)
        );
    }

    @ParameterizedTest
    @MethodSource("specificPriseProviderArguments")
    public void specificPriseTest(List<TV> expected, double minCost, double maxCost) {
        List<TV> actual = TvFilter.specificPrise(tv, minCost, maxCost);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> sortedByPriceAscendingProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(4), tv.get(1), tv.get(3), tv.get(2), tv.get(7), tv.get(0), tv.get(5), tv.get(6)))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByPriceAscendingProviderArguments")
    public void sortedByPriceAscendingTest(List<TV> expected) {
        List<TV> actual = TvFilter.sortedByPriceAscending(tv);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> sortedByPriceDescendingProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(tv.get(5), tv.get(6), tv.get(0), tv.get(7), tv.get(2), tv.get(3), tv.get(1), tv.get(4)))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByPriceDescendingProviderArguments")
    public void sortedByPriceDescendingTest(List<TV> expected) {
        List<TV> actual = TvFilter.sortedByPriceDescending(tv);
        Assertions.assertEquals(expected, actual);
    }
}
