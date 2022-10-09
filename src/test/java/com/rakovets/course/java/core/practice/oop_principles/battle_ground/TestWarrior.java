package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestWarrior {
    Warrior warrior = new Warrior("Viserious", 65);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 30),
                Arguments.of(0, 65),
                Arguments.of(-10, 75)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        warrior.takeDamage(damage);
        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 58), true),
                Arguments.of(new Warrior("Viserious", 0), false),
                Arguments.of(new Warrior("Viserious", -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Warrior warrior, boolean expected) {
        boolean actual = warrior.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(new Zombie(49), 37),
                Arguments.of(new Vampire(88), 76),
                Arguments.of(new Werewolf(4), -8)
        );
    }

    @ParameterizedTest(name = "AttackEnemy")
    @MethodSource("provideArgumentsForAttackEnemy")
    void testAttackEnemy(Enemy enemy, int expected) {
        warrior.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForImmortal() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 58), 58),
                Arguments.of(new Warrior("Viserious", 0), 100),
                Arguments.of(new Warrior("Viserious", -1), 100)
        );
    }

    @ParameterizedTest(name = "Immortal")
    @MethodSource("provideArgumentsForImmortal")
    void testImmortal(Warrior warrior, int expected) {
        warrior.immortal();
        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
