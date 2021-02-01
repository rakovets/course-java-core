package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class WitchTest {
    static Stream<Arguments> providerArgumentsForTotalAttack() {
        return Stream.of(
                Arguments.of(120, new Witch( 1)),
                Arguments.of(70, new Witch( 0))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForTotalAttack")
    void totalAttack(double expectedDouble, Witch witch) {
        Hero hero = new Archer("Shrek", 120);
        witch.totalAttack(hero);
        double actualDouble = hero.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
