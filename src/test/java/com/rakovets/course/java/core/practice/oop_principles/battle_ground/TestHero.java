package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestHero {
    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(new Archer("Valco", 89), 35, 54),
                Arguments.of(new Mag("Witcher", 100), 1, 99),
                Arguments.of(new Warrior("Viserious", 65), 10, 55)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(Hero hero, int damage, int expected) {
        hero.takeDamage(damage);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Archer("Valco", 89), true),
                Arguments.of(new Mag("Witcher", 100), true),
                Arguments.of(new Warrior("Viserious", 50), true),
                Arguments.of(new Archer("Valco", 0), false),
                Arguments.of(new Mag("Witcher", 0), false),
                Arguments.of(new Warrior("Viserious", 0), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Hero hero, boolean expected) {
        boolean actual = hero.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(new Archer("Valco", 89), new Zombie(49), 13),
                Arguments.of(new Mag("Witcher", 100), new Vampire(88), 48),
                Arguments.of(new Warrior("Viserious", 0), new Werewolf(4), -8)
        );
    }

    @ParameterizedTest(name = "AttackEnemy")
    @MethodSource("provideArgumentsForAttackEnemy")
    void testAttackEnemy(Hero hero, Enemy enemy, int expected) {
        hero.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTakeEnergy() {
        return Stream.of(
                Arguments.of(new Mag("Witcher", 100), new Zombie(100), 80, 120),
                Arguments.of(new Mag("Witcher", 100), new Vampire(88), 68, 120),
                Arguments.of(new Mag("Witcher", 100), new Werewolf(4), -16, 120)
        );
    }

    @ParameterizedTest(name = "TakeEnergy")
    @MethodSource("provideArgumentsForTakeEnergy")
    void testTakeEnergy(Mag mag, Enemy enemy,int expected, int expected2) {
        mag.takeEnergy(enemy);
        int actual = enemy.getHealth();
        int actual2 = mag.getHealth();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    static Stream<Arguments> provideArgumentsForUsePoisonArrow() {
        return Stream.of(
                Arguments.of(new Archer("Valco", 89), new Zombie(100), 25),
                Arguments.of(new Archer("Valco", 89), new Vampire(88), 13),
                Arguments.of(new Archer("Valco", 89), new Werewolf(4), -71)
        );
    }

    @ParameterizedTest(name = "UsePoisonArrow")
    @MethodSource("provideArgumentsForUsePoisonArrow")
    void testUsePoisonArrow(Archer archer, Enemy enemy, int expected) {
        archer.usePoisonArrow(enemy);
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
