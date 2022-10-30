package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.TV.ProjectTV;
import com.rakovets.course.java.core.practice.lambda_expressions.TV.TV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestTV {
    static ProjectTV tv = new ProjectTV("Vityz", "G10", 1988, 17, 100);
    static ProjectTV tv01 = new ProjectTV("Horizont", "F11", 1989, 19, 110);
    static ProjectTV tv02 = new ProjectTV("Everest", "P007", 1990, 17, 250);

    static Stream<Arguments> provideFromGetTVDiagonal() {
        return Stream.of(Arguments.of((List.of(tv, tv02, tv01)), 17, List.of(tv, tv02)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetTVDiagonal")
    public void getTVDiagonal(List<ProjectTV> listAll, Integer diagonal, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getTVDiagonal(listAll, diagonal);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetManufacture() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), "Horizont", List.of(tv01)),
                Arguments.of(List.of(tv, tv01, tv02), "LG", List.of()));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetManufacture")
    public void getManufacture(List<ProjectTV> listAll, String manufacture, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getManufacture(listAll, manufacture);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetNotOlder() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), 1985, List.of(tv, tv02, tv01)),
                Arguments.of(List.of(tv, tv01, tv02), 2000, List.of()));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetNotOlder")
    public void getNotOlder(List<ProjectTV> listAll, Integer year, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getNotOlder(listAll, year);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetRangePrice() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), 80, 150, List.of(tv, tv01)),
                Arguments.of(List.of(tv, tv01, tv02), 2000, 15000, List.of()));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetRangePrice")
    public void getRangePrice(List<ProjectTV> listAll, Integer minPrice, Integer maxPrice, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getRangePrice(listAll, minPrice, maxPrice);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetSortedInAscendingOrder() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), List.of(tv, tv01, tv02)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetSortedInAscendingOrder")
    public void getSortedInAscendingOrder(List<ProjectTV> listAll, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getSortedInAscendingOrder(listAll);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetSortedInDescendingOrder() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), List.of(tv02, tv01, tv)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetSortedInDescendingOrder")
    public void getSortedInDescendingOrder(List<ProjectTV> listAll, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getSortedInDescendingOrder(listAll);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetDiagonalSortedInAscendingOrder() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), List.of(tv, tv02, tv01)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetDiagonalSortedInAscendingOrder")
    public void getDiagonalSortedInAscendingOrder(List<ProjectTV> listAll, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getDiagonalSortedInAscendingOrder(listAll);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetDiagonalSortedInDescendingOrder() {
        return Stream.of(Arguments.of(List.of(tv, tv02, tv01), List.of(tv01, tv, tv02)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetDiagonalSortedInDescendingOrder")
    public void getDiagonalSortedInDescendingOrder(List<ProjectTV> listAll, List<ProjectTV> expected) {
        TV tv = new TV(listAll);

        List<ProjectTV> actual = tv.getDiagonalSortedInDescendingOrder(listAll);

        Assertions.assertEquals(expected, actual);
    }
}
