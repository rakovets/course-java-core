package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {

    static Stream<Arguments> ProvideArgumentsForIsAliveMethod() {
        return Stream.of(
                Arguments.of(90, new Zombie(90)),
                Arguments.of(100, new Zombie(0))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForIsAliveMethod")
    void ressurect(int expected, Zombie zombie) {

        zombie.ressurect();
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
