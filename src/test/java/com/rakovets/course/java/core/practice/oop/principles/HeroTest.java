package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HeroTest {
    static Stream<Arguments> provideArgumentsForHero() {
        return Stream.of(
                Arguments.of("Warrior", "Warrior attacks the enemy"),
                Arguments.of("Mag", "Mag attacks the enemy"),
                Arguments.of("Archer", "Archer attacks the enemy")
        );
    }

    @ParameterizedTest(name = "Hero - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForHero")
    void heroTest(String str1, String expected) {
        Hero hero = new Hero(str1);
        String actual = hero.getName() + " attacks the enemy";
        Assertions.assertEquals(expected, actual);
    }


}
