package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestMag {
    Mag mag = new Mag("Witcher", 100);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 65),
                Arguments.of(0, 100),
                Arguments.of(-10, 110)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        mag.takeDamage(damage);
        int actual = mag.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Mag("Witcher", 10), true),
                Arguments.of(new Mag("Witcher", 0), false),
                Arguments.of(new Mag("Witcher", -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Mag mag, boolean expected) {
        boolean actual = mag.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(new Zombie(49), 9),
                Arguments.of(new Vampire(88), 48),
                Arguments.of(new Werewolf(4), -36)
        );
    }

    @ParameterizedTest(name = "AttackEnemy")
    @MethodSource("provideArgumentsForAttackEnemy")
    void testAttackEnemy(Enemy enemy, int expected) {
        mag.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTakeEnergy() {
        return Stream.of(
                Arguments.of(new Zombie(100), 80, 120),
                Arguments.of(new Vampire(88), 68, 120),
                Arguments.of(new Werewolf(4), -16, 120)
        );
    }

    @ParameterizedTest(name = "TakeEnergy")
    @MethodSource("provideArgumentsForTakeEnergy")
    void testTakeEnergy(Enemy enemy,int expected, int expected2) {
        mag.takeEnergy(enemy);
        int actual = enemy.getHealth();
        Assertions.assertEquals(expected, actual);

        int actual2 = mag.getHealth();
        Assertions.assertEquals(expected2, actual2);
    }
}
