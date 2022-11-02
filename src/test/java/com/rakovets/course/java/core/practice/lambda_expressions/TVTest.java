package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.TvInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TVTest {
    TvInfo tvInfo;

    @BeforeEach
    void init() {
        TV tv1 = new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0);
        TV tv2 = new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0);
        TV tv3 = new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78);
        TV tv4 = new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0);
        TV tv5 = new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9);
        LinkedList<TV> tvs = new LinkedList<>();
        tvInfo = new TvInfo(tvs);
        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);
        tvs.add(tv4);
        tvs.add(tv5);
    }

    static Stream<Arguments> provideArgumentsForTVByDiagonal() {
        return Stream.of(
                Arguments.of(102,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0)))),
                Arguments.of(88.55,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                                new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTVByDiagonal")
    public void getTVByDiagonal(double diagonal, List<TV> expected) {

        List<TV> actual = tvInfo.getTVByDiagonal(diagonal);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTVByManufacturer() {
        return Stream.of(
                Arguments.of("Samsung",
                        new ArrayList<>(List.of(
                                new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                                new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0)))),
                Arguments.of("Panasonic",
                        new ArrayList<>(List.of(
                                new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTVByManufacturer")
    public void getTVByManufacturer(String manufacturer, List<TV> expected) {

        List<TV> actual = tvInfo.getTVByManufacturer(manufacturer);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTVByMinYear() {
        return Stream.of(
                Arguments.of(2018,
                        new ArrayList<>(List.of(
                                new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                                new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                                new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9)))),
                Arguments.of(2021,
                        new ArrayList<>(List.of(
                                new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                                new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTVByMinYear")
    public void getTVByMinYear(int year, List<TV> expected) {

        List<TV> actual = tvInfo.getTVByMinYear(year);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForVByPriceRange() {
        return Stream.of(
                Arguments.of(2500, 6000,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                                new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0)))),
                Arguments.of(2000, 5000,
                        new ArrayList<>(List.of(
                                new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                                new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                                new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                                new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForVByPriceRange")
    public void getVByPriceRange(double firstPrice, double lastPrice, List<TV> expected) {

        List<TV> actual = tvInfo.getTVByPriceRange(firstPrice, lastPrice);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sortedByPriceAscending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9),
                        new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                        new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                        new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                        new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0))))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByPriceAscending")
    public void sortedByPriceAscending(List<TV> expected) {

        List<TV> actual = tvInfo.sortedByPriceAscending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sortedByPriceDescending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0),
                        new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                        new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                        new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                        new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9))))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByPriceDescending")
    public void sortedByPriceDescending(List<TV> expected) {

        List<TV> actual = tvInfo.sortedByPriceDescending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sortedByDiagonalAscending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                        new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9),
                        new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0),
                        new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                        new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78))))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByDiagonalAscending")
    public void sortedByDiagonalAscending(List<TV> expected) {

        List<TV> actual = tvInfo.sortedByDiagonalAscending();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> sortedByDiagonalDescending() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new TV("LG", "55UP75006LF", 2021, 139.7, 2076.78),
                        new TV("Philips", "55PUS7956/60", 2021, 108, 2160.0),
                        new TV("Samsung", "UE40D5000PW", 2012, 102, 5500.0),
                        new TV("Samsung", "UE32D5000PW", 2011, 88.55, 4699.0),
                        new TV("Panasonic", "TX-40GXR700", 2019, 88.55, 2059.9))))
        );
    }

    @ParameterizedTest
    @MethodSource("sortedByDiagonalDescending")
    public void sortedByDiagonalDescending(List<TV> expected) {

        List<TV> actual = tvInfo.sortedByDiagonalDescending();

        Assertions.assertEquals(expected, actual);
    }
}
