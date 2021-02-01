package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {
    static Stream<Arguments> providerArgumentsForResurrect() {
        return Stream.of(
                Arguments.of(1, new Zombie( 1)),
                Arguments.of(50, new Zombie( 0))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForResurrect")
    void resurrect(double expectedDouble, Zombie zombie) {
        zombie.resurrect();
        double actualDouble = zombie.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
