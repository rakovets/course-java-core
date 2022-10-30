package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestTvTelevisorUtility {
    Utility utility = new Utility();

    static Stream<Arguments> provideArgumentsGetTelevisorWithSetDiagonal() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2000, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2001, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        5.5,
                        "[Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2001, diagonal=5.5, price=105.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorWithSetDiagonal")
    void testGetTelevisorWithSetDiagonal(List<Televisor> tv, double setDiagonal, String expected) {
        List<Televisor> actual = utility.getTelevisorWithSetDiagonal(tv, setDiagonal);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorWithSetManufacturer() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2000, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2001, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        "Philips",
                        "[Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2001, diagonal=5.5, price=105.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorWithSetManufacturer")
    void testGetTelevisorWithSetManufacturer(List<Televisor> tv, String Manufacturer, String expected) {
        List<Televisor> actual = utility.getTelevisorWithSetManufacturer(tv, Manufacturer);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorWithLimitYearOfIssue() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        2000,
                        "[Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorWithLimitYearOfIssue")
    void testGetTelevisorWithLimitYearOfIssue(List<Televisor> tv, int limitYearOfIssue, String expected) {
        List<Televisor> actual = utility.getTelevisorWithLimitYearOfIssue(tv, limitYearOfIssue);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorWithPriceRange() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        102.0, 106.0,
                        "[Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorWithPriceRange")
    void testGetTelevisorWithPriceRange(List<Televisor> tv, double startPrice, double finalPrice, String expected) {
        List<Televisor> actual = utility.getTelevisorWithPriceRange(tv, startPrice, finalPrice);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorSortedPriceAscending() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        "[Televisor{manufacturer='LG', modelName='Model1', yearOfIssue=2001, diagonal=5.0, price=100.0}," +
                                " Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}, " +
                                "Televisor{manufacturer='Xiaomi', modelName='Model3', yearOfIssue=2002, diagonal=6.0, price=110.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorSortedPriceAscending")
    void testGetTelevisorSortedPriceAscending(List<Televisor> tv, String expected) {
        List<Televisor> actual = utility.getTelevisorSortedPriceAscending(tv);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorSortedPriceDescending() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        "[Televisor{manufacturer='Xiaomi', modelName='Model3', yearOfIssue=2002, diagonal=6.0, price=110.0}, " +
                                "Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}, " +
                                "Televisor{manufacturer='LG', modelName='Model1', yearOfIssue=2001, diagonal=5.0, price=100.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorSortedPriceDescending")
    void testGetTelevisorSortedPriceDescending(List<Televisor> tv, String expected) {
        List<Televisor> actual = utility.getTelevisorSortedPriceDescending(tv);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorSortedDiagonalAscending() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        "[Televisor{manufacturer='LG', modelName='Model1', yearOfIssue=2001, diagonal=5.0, price=100.0}, " +
                                "Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}, " +
                                "Televisor{manufacturer='Xiaomi', modelName='Model3', yearOfIssue=2002, diagonal=6.0, price=110.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorSortedDiagonalAscending")
    void testGetTelevisorSortedDiagonalAscending(List<Televisor> tv, String expected) {
        List<Televisor> actual = utility.getTelevisorSortedDiagonalAscending(tv);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsGetTelevisorSortedDiagonalDescending() {
        return Stream.of(
                Arguments.of(List.of(
                                new Televisor("LG", "Model1", 2001, 5.0, 100.0),
                                new Televisor("Philips", "Model2", 2000, 5.5, 105.0),
                                new Televisor("Xiaomi", "Model3", 2002, 6.0, 110.0)),
                        "[Televisor{manufacturer='Xiaomi', modelName='Model3', yearOfIssue=2002, diagonal=6.0, price=110.0}, " +
                                "Televisor{manufacturer='Philips', modelName='Model2', yearOfIssue=2000, diagonal=5.5, price=105.0}, " +
                                "Televisor{manufacturer='LG', modelName='Model1', yearOfIssue=2001, diagonal=5.0, price=100.0}]"));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetTelevisorSortedDiagonalDescending")
    void testGetTelevisorSortedDiagonalDescending(List<Televisor> tv, String expected) {
        List<Televisor> actual = utility.getTelevisorSortedDiagonalDescending(tv);

        Assertions.assertEquals(expected, actual.toString());
    }
}
