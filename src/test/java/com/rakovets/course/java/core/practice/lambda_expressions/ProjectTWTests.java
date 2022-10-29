package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectTWTests {
    static TV tv1 = new TV("Samsung", "RT520", 2010, 25, 1000);
    static TV tv2 = new TV("Philips", "DXC360", 2009, 23, 900);
    static TV tv3 = new TV("LG", "LT7790", 2013, 23, 1100);
    static TV tv4 = new TV("Samsung", "RT770", 2012, 28, 1300);
    static TV tv5 = new TV("LG", "LT8800", 2008, 22, 770);
    List<TV> listTV = new ArrayList<TV>(Arrays.asList(tv1, tv2, tv3, tv4, tv5));
    static Stream<Arguments> provideArgumentsGetTVWithGivenDiagonal() {
        return Stream.of(
                Arguments.of(23, List.of(tv2, tv3)),
                Arguments.of(25, List.of(tv1)),
                Arguments.of(20, List.of())
        );
    }

    @MethodSource("provideArgumentsGetTVWithGivenDiagonal")
    @ParameterizedTest()
    void testGetTVWithGivenDiagonal(int diagonal, List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVWithGivenDiagonal(listTV, diagonal);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVSomeManufacturer() {
        return Stream.of(
                Arguments.of("LG", List.of(tv3, tv5)),
                Arguments.of("Philips", List.of(tv2)),
                Arguments.of("Edge", List.of())
        );
    }

    @MethodSource("provideArgumentsGetTVSomeManufacturer")
    @ParameterizedTest()
    void testGetTVSomeManufacturer(String manufacturer, List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVSomeManufacturer(listTV, manufacturer);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVNotOlderYear() {
        return Stream.of(
                Arguments.of(2010, List.of(tv1, tv3, tv4)),
                Arguments.of(2013, List.of(tv3)),
                Arguments.of(2020, List.of())
        );
    }

    @MethodSource("provideArgumentsGetTVNotOlderYear")
    @ParameterizedTest()
    void testGetTVNotOlderYear(int year, List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVNotOlderYear(listTV, year);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVWithPriceRange() {
        return Stream.of(
                Arguments.of(900, 1100, List.of(tv1, tv2, tv3)),
                Arguments.of(600, 900, List.of(tv2, tv5)),
                Arguments.of(1200, 1300, List.of(tv4))
        );
    }

    @MethodSource("provideArgumentsGetTVWithPriceRange")
    @ParameterizedTest()
    void testGetTVWithPriceRange(int minPrice, int maxPrice, List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVWithPriceRange(listTV, minPrice, maxPrice);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVSortedByPriceAscending() {
        return Stream.of(
                Arguments.of(List.of(tv5, tv2, tv1, tv3, tv4))
        );
    }

    @MethodSource("provideArgumentsGetTVSortedByPriceAscending")
    @ParameterizedTest()
    void testGetTVSortedByPriceAscending(List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVSortedByPriceAscending(listTV);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVSortedByPriceDescending() {
        return Stream.of(
                Arguments.of(List.of(tv4, tv3, tv1, tv2, tv5))
        );
    }

    @MethodSource("provideArgumentsGetTVSortedByPriceDescending")
    @ParameterizedTest()
    void testGetTVSortedByPriceDescending(List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVSortedByPriceDescending(listTV);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVSortedByDiagonalAscending() {
        return Stream.of(
                Arguments.of(List.of(tv5, tv2, tv3, tv1, tv4))
        );
    }

    @MethodSource("provideArgumentsGetTVSortedByDiagonalAscending")
    @ParameterizedTest()
    void testGetTVSortedByDiagonalAscending(List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVSortedByDiagonalAscending(listTV);

        assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsGetTVSortedByDiagonalDescending() {
        return Stream.of(
                Arguments.of(List.of(tv4, tv1, tv2, tv3, tv5))
        );
    }

    @MethodSource("provideArgumentsGetTVSortedByDiagonalDescending")
    @ParameterizedTest()
    void testGetTVSortedByDiagonalDescending(List<TV> expected) {
        ProjectTV projectTV = new ProjectTV(listTV);

        List<TV> actual = projectTV.getTVSortedByDiagonalDescending(listTV);

        assertEquals(expected, actual);
    }
}
