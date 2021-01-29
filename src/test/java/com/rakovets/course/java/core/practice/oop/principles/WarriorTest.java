package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    static Stream<Arguments> ProvideArgumentsForAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(79, new Enemy(100)),
                Arguments.of(28, new Enemy(49))
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForAttackEnemyMethod")
    void attackEnemy(int expected, Enemy enemy) {
        Warrior warrior = new Warrior("Jon", 98);

        warrior.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForSuperPowerMethod() {
        return Stream.of(
                Arguments.of(31, 19),
                Arguments.of(32, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForSuperPowerMethod")
    void superPower(int expected, int health) {
        Warrior warrior = new Warrior("Jon", health);

        warrior.superPower();
        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
