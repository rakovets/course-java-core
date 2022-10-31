package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv.TvProject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TvProjectTest {
    static Stream<Arguments> provideArgsForDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDiagonal")
    public void getByDiagonal(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.getByDiagonal(50);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForManufacturer() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
                        new ArrayList<>(List.of(
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForManufacturer")
    public void getByManufacturer(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.getByManufacturer("LG");
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForYear() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
                        new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForYear")
    public void getByYear(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.getByYear(2021);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForRange() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
                        new ArrayList<>(List.of(
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000)
                        ))));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForRange")
    public void getByPriceRange(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.getByPriceRange(70000,100000);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForAscendingPrices() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
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
    public void getByPricesAsc(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.sortedByPrice();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForDescendingPrices() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
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
    public void getByPricesDesc(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.sortedByDescendingPrices();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForAscDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
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
    public void getByAscDiagonal(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.sortedByDiagonalAsc();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgsForDescDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new TV("Samsung", "QN90A", 2022, 75, 330000),
                                new TV("Samsung", "QN87A", 2020, 65, 200000),
                                new TV("Samsung", "Crystal UHD", 2022, 50, 73000),
                                new TV("LG", "UQ81", 2021, 50, 80000),
                                new TV("LG", "UQ80", 2022, 50, 80000))),
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
    public void getByDescDiagonal(List<TV> tvs, List<TV> expected) {
        TvProject tvProject = new TvProject(tvs);
        List<TV> actual = tvProject.sortedByDiagonalDesc();
        Assertions.assertEquals(actual, expected);
    }
}
