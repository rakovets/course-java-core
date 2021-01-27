package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GoblinTest {

    static Stream<Arguments> ProvideArgumentsForGivePoisonMethod() {
        return Stream.of(
                Arguments.of(46, new Warrior("Vasya", 92))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForGivePoisonMethod")
    void givePoison(int expected, Warrior warrior) {
        Goblin goblin = new Goblin(100);
        goblin.givePoison(warrior);
        int actual = warrior.getHealth();
        Assertions.assertEquals(expected, actual);
    }
}
