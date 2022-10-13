package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestEnemy {
    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(new Zombie(55), 30, 25),
                Arguments.of(new Werewolf(89), 10, 79),
                Arguments.of(new Vampire(97), 10, 87)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(Enemy enemy, int damage, int expected) {
        enemy.takeDamage(damage);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Zombie(55), true),
                Arguments.of(new Werewolf(89), true),
                Arguments.of(new Vampire(97), true),
                Arguments.of(new Zombie(0), false),
                Arguments.of(new Werewolf(0), false),
                Arguments.of(new Vampire(0), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Enemy enemy, boolean expected) {
        boolean actual = enemy.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(new Zombie(55), new Warrior("Viserious", 49), 9),
                Arguments.of(new Werewolf(55), new Mag("Witcher", 88), 53),
                Arguments.of(new Vampire(55), new Archer("Valco", 4), -21)
        );
    }

    @ParameterizedTest(name = "AttackHero")
    @MethodSource("provideArgumentsForAttackHero")
    void testAttackHero(Enemy enemy, Hero hero, int expected) {
        enemy.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForResurrection() {
        return Stream.of(
                Arguments.of(new Zombie( 58), 58),
                Arguments.of(new Zombie( 0), 95),
                Arguments.of(new Zombie( -1), 95)
        );
    }

    @ParameterizedTest(name = "Resurrection")
    @MethodSource("provideArgumentsForResurrection")
    void testResurrection(Zombie zombie, int expected) {
        zombie.resurrection();
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForDrinkBlood() {
        return Stream.of(
                Arguments.of(new Vampire(55), new Warrior("Viserious", 49), 39, 65),
                Arguments.of(new Vampire(60), new Mag("Witcher", 88), 78, 70),
                Arguments.of(new Vampire(90), new Archer("Valco", 4), -6, 100)
        );
    }

    @ParameterizedTest(name = "DrinkBlood")
    @MethodSource("provideArgumentsForDrinkBlood")
    void testDrinkBlood(Vampire vampire, Hero hero,int expected, int expected2) {
        vampire.drinkBlood(hero);
        int actual = hero.getHealth();
        int actual2 = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }

    static Stream<Arguments> provideArgumentsForInWolfBody() {
        return Stream.of(
                Arguments.of(new Werewolf( 58), 73),
                Arguments.of(new Werewolf( 0), 15),
                Arguments.of(new Werewolf( -1), 14)
        );
    }

    @ParameterizedTest(name = "InWolfBody")
    @MethodSource("provideArgumentsForInWolfBody")
    void testInWolfBody(Werewolf werewolf, int expected) {
        werewolf.transformToWolfBody();
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
