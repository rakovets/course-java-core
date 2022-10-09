package com.rakovets.course.java.core.practice.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.Season;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SeasonsTests {
    static Stream<Arguments> ProviderArgumentsFindFavoriteSeason() {
        return Stream.of(
                Arguments.of("WINTER", "I like winter"),
                Arguments.of("SPRING", "I like spring"),
                Arguments.of("SUMMER", "I like summer"),
                Arguments.of("AUTUMN", "I like autumn")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsFindFavoriteSeason")
    void testFindFavoriteSeason(Seasons season, String expected) {
        String actual = season.findFavoriteSeason(season);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsGetDescription() {
        return Stream.of(
                Arguments.of("WINTER", "It's so cold!"),
                Arguments.of("SPRING", "It's so cold!"),
                Arguments.of("SUMMER", "It's so hot!"),
                Arguments.of("AUTUMN", "It's so cold!")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsGetDescription")
    void testGetDescription(Seasons season, String expected) {
        String actual = season.getDescription(season);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProviderArgumentsGetMyFavoriteSeason() {
        return Stream.of(
                Arguments.of("SPRING", "Favorite season is SPRING")
        );
    }

    @ParameterizedTest
    @MethodSource("ProviderArgumentsGetMyFavoriteSeason")
    void testGetMyFavoriteSeason(Seasons season, String expected) {
        String actual = season.getMyFavoriteSeason();

        Assertions.assertEquals(expected, actual);
    }
}

