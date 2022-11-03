package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv.TvProject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TvProjectTest {
    TvProject tvProject;

    @BeforeEach
    public void tvCharacteristics() {
       TV tv1 = new TV("Samsung", "QN90A", 2022, 75, 330000);
       TV tv2 = new TV("Samsung", "QN87A", 2020, 65, 200000);
       TV tv3 = new TV("Samsung", "Crystal UHD", 2022, 50, 73000);
       TV tv4 = new TV("LG", "UQ81", 2021, 50, 80000);
       TV tv5 = new TV("LG", "UQ80", 2022, 50, 80000);
       List<TV> tvModels = new ArrayList<>();
       tvProject = new TvProject(tvModels);
       tvModels.add(tv1);
       tvModels.add(tv2);
       tvModels.add(tv3);
       tvModels.add(tv4);
       tvModels.add(tv5);
    }

    static Stream<Arguments> provideArgsForDiagonal() {
        return Stream.of(
                Arguments.of(50,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDiagonal")
    public void testByDiagonal(double diagonal, List<TV> expected) {
        List<TV> actual = tvProject.getByDiagonal(diagonal);

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForManufacturer() {
        return Stream.of(
                Arguments.of("LG",
                        new ArrayList<>(List.of(
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForManufacturer")
    public void testByManufacturer(String manufacturer, List<TV> expected) {
        List<TV> actual = tvProject.getByManufacturer(manufacturer);

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForYear() {
        return Stream.of(
                Arguments.of(2021,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForYear")
    public void testByYear(int year, List<TV> expected) {
        List<TV> actual = tvProject.getByYear(year);

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForRange() {
        return Stream.of(
                Arguments.of(70000, 100000,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForRange")
    public void testByPriceRange(int startPrice, int finishPrice, List<TV> expected) {
        List<TV> actual = tvProject.getByPriceRange(startPrice,finishPrice);

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForAscendingPrices() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "QN90A", 2022, 75, 330000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForAscendingPrices")
    public void testByPricesAsc(List<TV> expected) {
        List<TV> actual = tvProject.sortedByPrice();

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForDescendingPrices() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDescendingPrices")
    public void testByPricesDesc(List<TV> expected) {
        List<TV> actual = tvProject.sortedByDescendingPrices();

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForAscDiagonal() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "QN90A", 2022, 75, 330000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForAscDiagonal")
    public void testByAscDiagonal(List<TV> expected) {
        List<TV> actual = tvProject.sortedByDiagonalAsc();

        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForDescDiagonal() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                                ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDescDiagonal")
    public void testByDescDiagonal(List<TV> expected) {
        List<TV> actual = tvProject.sortedByDiagonalDesc();

        Assertions.assertEquals(actual, expected);
    }
}
