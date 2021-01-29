package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    static Stream<Arguments> ProvideArgumentsForAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(81, new Enemy(100)),
                Arguments.of(32, new Enemy(51))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForAttackEnemyMethod")
    void attackEnemy(int expected, Enemy enemy) {
        Archer archer = new Archer("Jon", 98);

        archer.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForSuperPowerMethod() {
        return Stream.of(
                Arguments.of(30, 19),
                Arguments.of(31, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForSuperPowerMethod")
    void superPower(int expected, int health) {
        Archer archer = new Archer("Jon", health);

        archer.superPower();
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
