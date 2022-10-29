package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.ProjectTV;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.Television;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TvTest {
    static Stream<Arguments> UniqueCities() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("UniqueCities")
    public void getUniqueCities(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListDiagonal(50);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListManufacturer() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListManufacturer")
    public void getListManufacturer(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListManufacturer("LG");

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListLessThanYear() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListLessThanYear")
    public void getListLessThanYear(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListLessThanYear(2022);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListPriceRange() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListPriceRange")
    public void getListPriceRange(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListPriceRange(1300, 1700);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListSortedByPriceAscending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0)))
                ));
    }

    @ParameterizedTest
    @MethodSource("ListSortedByPriceAscending")
    public void getListSortedByPriceAscending(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListSortedByPriceAscending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListSortedByPriceDescending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0),
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListSortedByPriceDescending")
    public void getListSortedByPriceDescending(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListSortedByPriceDescending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListSortedByDiagonalAscending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListSortedByDiagonalAscending")
    public void getListSortedByDiagonalAscending(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListSortedByDiagonalAscending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ListSortedByDiagonalDescending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30),
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0))),
                        new ArrayList<>(List.of(
                                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0),
                                new Television("LG", "NanoCell", 2022, 50, 2027.4),
                                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                                new Television("Sumsung", "UE32T5300AU", 2020, 32, 1151.30)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("ListSortedByDiagonalDescending")
    public void getListSortedByDiagonalDescending(List<Television> tv, List<Television> expected) {
        ProjectTV television = new ProjectTV(tv);

        List<Television> actual = television.getListSortedByDiagonalDescending();

        Assertions.assertEquals(expected, actual);
    }
}
