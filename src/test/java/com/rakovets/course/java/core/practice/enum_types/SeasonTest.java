package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SeasonTest {

    static Stream<Arguments> getMyFavoriteSeasonProviderArguments() {
        return Stream.of(
                Arguments.of("WINTER", "My favorite seasons is winter.\n" +
                        "The average temperature for my favorite time of the year -1. Cold season."),
                Arguments.of("SPRING", "My favorite seasons is winter.\n" +
                        "The average temperature for my favorite time of the year -1. Cold season."),
                Arguments.of("SUMMER", "My favorite seasons is winter.\n" +
                        "The average temperature for my favorite time of the year -1. Cold season."),
                Arguments.of("AUTUMN", "My favorite seasons is winter.\n" +
                        "The average temperature for my favorite time of the year -1. Cold season.")
        );
    }

    @ParameterizedTest
    @MethodSource("getMyFavoriteSeasonProviderArguments")
    void getMyFavoriteSeason(Season season, String expected) {
        String actual = season.getMyFavoriteSeason();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> findsAFavoriteSeasonProviderArguments() {
        return Stream.of(
                Arguments.of("WINTER", "Favorite season is winter."),
                Arguments.of("SPRING", "Favorite season is spring."),
                Arguments.of("SUMMER", "Favorite season is summer."),
                Arguments.of("AUTUMN", "Favorite season is autumn.")
        );
    }

    @ParameterizedTest
    @MethodSource("findsAFavoriteSeasonProviderArguments")
    void findsAFavoriteSeason(Season season, String expected) {
        String actual = season.findsAFavoriteSeason(season);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getDescriptionProviderArguments() {
        return Stream.of(
                Arguments.of("WINTER", "Cold season"),
                Arguments.of("SPRING", "Cold season"),
                Arguments.of("SUMMER", "Warm season"),
                Arguments.of("AUTUMN", "Cold season")
        );
    }

    @ParameterizedTest
    @MethodSource("getDescriptionProviderArguments")
    void getDescription(Season season, String expected) {
        String actual = season.getDescription();

        Assertions.assertEquals(expected, actual);
    }
}
