package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestArcher {
    Archer archer = new Archer("Valco", 89);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 54),
                Arguments.of(0, 89),
                Arguments.of(-10, 99)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        archer.takeDamage(damage);

        int actual = archer.getHealth();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Archer("Valco", 10), true),
                Arguments.of(new Archer("Valco", 0), false),
                Arguments.of(new Archer("Valco", -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Archer archer, boolean expected) {
        boolean actual = archer.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(new Zombie(49), 13),
                Arguments.of(new Vampire(88), 52),
                Arguments.of(new Werewolf(4), -32)
        );
    }

    @ParameterizedTest(name = "AttackEnemy")
    @MethodSource("provideArgumentsForAttackEnemy")
    void testAttackEnemy(Enemy enemy, int expected) {
        archer.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForUsePoisonArrow() {
        return Stream.of(
                Arguments.of(new Zombie(100), 25),
                Arguments.of(new Vampire(88), 13),
                Arguments.of(new Werewolf(4), -71)
        );
    }

    @ParameterizedTest(name = "UsePoisonArrow")
    @MethodSource("provideArgumentsForUsePoisonArrow")
    void testUsePoisonArrow(Enemy enemy, int expected) {
        archer.usePoisonArrow(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
