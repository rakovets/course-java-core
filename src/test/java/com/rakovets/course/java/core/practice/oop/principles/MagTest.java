package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MagTest {

    static Stream<Arguments> provideArgumentsForAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(83, new Enemy(100)),
                Arguments.of(53, new Enemy(70))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemyMethod")
    void attackEnemy(int expected, Enemy enemy) {
        Mag mag = new Mag("Jon", 98);

        mag.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSuperPowerMethod() {
        return Stream.of(
                Arguments.of(29, 19),
                Arguments.of(30, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSuperPowerMethod")
    void superPower(int expected, int health) {
        Mag mag = new Mag("Jon", health);

        mag.superPower();
        int actual = mag.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
