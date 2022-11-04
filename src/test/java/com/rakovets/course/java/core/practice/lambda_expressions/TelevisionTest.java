package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.InformationSystemTv;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.Television;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TelevisionTest {
    InformationSystemTv infoTv = new InformationSystemTv();

    static Stream<Arguments> provideArgumentsForConstructor() {
        return Stream.of(
                Arguments.of("Panasonic", "AKV-1200", 2020, 45.0, 700.0,
                        "{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}"),
                Arguments.of("Sony", "LDS-2100", 2018, 43.5, 650.0,
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}"),
                Arguments.of("Philips", "RE-12", 2021, 55.0, 820.0,
                        "{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}"),
                Arguments.of("Samsung", "PPk43", 2019, 60.0, 1090.0,
                        "{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}"),
                Arguments.of("LG", "L005", 2022, 42.5, 620.5,
                        "{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructor")
    void testConstructor(String manufacturer, String modelName, int yearOfProduction,
                                double diagonal, double price, String expected) {
        Television actual = new Television(manufacturer, modelName, yearOfProduction, diagonal, price);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetMethods() {
        return Stream.of(
                Arguments.of("Panasonic", "AKV-1200", 2020, 45.0, 700.0,
                        "Panasonic, AKV-1200, 2020, 700.0, 700.0"),
                Arguments.of("Sony", "LDS-2100", 2018, 43.5, 650.0,
                        "Sony, LDS-2100, 2018, 650.0, 650.0"),
                Arguments.of("Philips", "RE-12", 2021, 55.0, 820.0,
                        "Philips, RE-12, 2021, 820.0, 820.0"),
                Arguments.of("Samsung", "PPk43", 2019, 60.0, 1090.0,
                        "Samsung, PPk43, 2019, 1090.0, 1090.0"),
                Arguments.of("LG", "L005", 2022, 42.5, 620.5,
                        "LG, L005, 2022, 620.5, 620.5")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMethods")
    void testGetMethods(String manufacturer, String modelName, int yearOfProduction,
                         double diagonal, double price, String expected) {
        Television television = new Television(manufacturer, modelName, yearOfProduction, diagonal, price);
        String actual = television.getManufacturer() + ", " + television.getModelName() + ", "
                + television.getYearOfProduction() + ", " + television.getPrice() + ", " + television.getPrice();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionGivenDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        55.0, "[{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionGivenDiagonal")
    void testGetTelevisionGivenDiagonal(ArrayList<Television> televisions, double diagonal, String expected) {
        List<Television> actual = infoTv.getTelevisionGivenDiagonal(televisions, diagonal);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionGivenManufacturer() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        "Samsung", "[{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionGivenManufacturer")
    void testGetTelevisionGivenManufacturer(ArrayList<Television> televisions, String manufacturer, String expected) {
        InformationSystemTv infoTv = new InformationSystemTv();
        List<Television> actual = infoTv.getTelevisionGivenManufacturer(televisions, manufacturer);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionGivenMinYearOfProduction() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                       new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                       new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                       new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                       new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                       new Television("LG", "L005", 2022, 42.5, 620.5))),
                        2020, "[{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionGivenMinYearOfProduction")
    void testGetTelevisionGivenMinYearOfProduction(List<Television> televisions, int yearOfProduction, String expected) {
        List<Television> actual = infoTv.getTelevisionGivenMinYearOfProduction(televisions, yearOfProduction);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionGivenRangePrice() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        600.0, 800.0, "[{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}, " +
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionGivenRangePrice")
    void testGetTelevisionGivenRangePrice(List<Television> televisions, double minPrice, double maxPrice, String expected) {
        List<Television> actual = infoTv.getTelevisionGivenRangePrice(televisions, minPrice, maxPrice);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionSortedMinMaxPrice() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        "[{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}, " +
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}, " +
                        "{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}, " +
                        "{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionSortedMinMaxPrice")
    void testGetTelevisionSortedMinMaxPrice(List<Television> televisions, String expected) {
        List<Television> actual = infoTv.getTelevisionSortedMinMaxPrice(televisions);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionSortedMaxMinPrice() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        "[{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}, " +
                        "{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}, " +
                        "{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}, " +
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionSortedMaxMinPrice")
    void testGetTelevisionSortedMaxMinPrice(List<Television> televisions, String expected) {
        List<Television> actual = infoTv.getTelevisionSortedMaxMinPrice(televisions);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionSortedMinMaxDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        "[{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}, " +
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}, " +
                        "{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}, " +
                        "{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionSortedMinMaxDiagonal")
    void testGetTelevisionSortedMinMaxDiagonal(List<Television> televisions, String expected) {
        List<Television> actual = infoTv.getTelevisionSortedMinMaxDiagonal(televisions);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetTelevisionSortedMaxMinDiagonal() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Television("Panasonic", "AKV-1200", 2020, 45.0, 700.0),
                        new Television("Sony", "LDS-2100", 2018, 43.5, 650.0),
                        new Television("Philips", "RE-12", 2021, 55.0, 820.0),
                        new Television("Samsung", "PPk43", 2019, 60.0, 1090.0),
                        new Television("LG", "L005", 2022, 42.5, 620.5))),
                        "[{Manufacturer: Samsung, model TV: PPk43, year of production: 2019, " +
                                "diagonal: 60.0, price: 1090.0}, " +
                        "{Manufacturer: Philips, model TV: RE-12, year of production: 2021, " +
                                "diagonal: 55.0, price: 820.0}, " +
                        "{Manufacturer: Panasonic, model TV: AKV-1200, year of production: 2020, " +
                                "diagonal: 45.0, price: 700.0}, " +
                        "{Manufacturer: Sony, model TV: LDS-2100, year of production: 2018, " +
                                "diagonal: 43.5, price: 650.0}, " +
                        "{Manufacturer: LG, model TV: L005, year of production: 2022, " +
                                "diagonal: 42.5, price: 620.5}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetTelevisionSortedMaxMinDiagonal")
    void testGetTelevisionSortedMaxMinDiagonal(List<Television> televisions, String expected) {
        List<Television> actual = infoTv.getTelevisionSortedMaxMinDiagonal(televisions);

        Assertions.assertEquals(expected, actual.toString());
    }
}
