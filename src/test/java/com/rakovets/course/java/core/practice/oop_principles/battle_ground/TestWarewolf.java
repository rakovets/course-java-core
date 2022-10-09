package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestWarewolf {
    Werewolf werewolf = new Werewolf(87);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 52),
                Arguments.of(0, 87),
                Arguments.of(-10, 97)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        werewolf.takeDamage(damage);
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Werewolf( 58), true),
                Arguments.of(new Werewolf( 0), false),
                Arguments.of(new Werewolf( -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Werewolf werewolf, boolean expected) {
        boolean actual = werewolf.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 49), 14),
                Arguments.of(new Mag("Witcher", 88), 53),
                Arguments.of(new Archer("Valco", 4), -31)
        );
    }

    @ParameterizedTest(name = "AttackHero")
    @MethodSource("provideArgumentsForAttackHero")
    void testAttackHero(Hero hero, int expected) {
        werewolf.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
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
        werewolf.inWolfBody();
        int actual = werewolf.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
