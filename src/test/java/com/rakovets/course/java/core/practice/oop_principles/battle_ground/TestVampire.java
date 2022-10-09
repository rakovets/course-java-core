package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestVampire {
    Vampire vampire = new Vampire(99);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 64),
                Arguments.of(0, 99),
                Arguments.of(-10, 109)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        vampire.takeDamage(damage);
        int actual = vampire.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Vampire( 58), true),
                Arguments.of(new Vampire( 0), false),
                Arguments.of(new Vampire( -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Vampire vampire, boolean expected) {
        boolean actual = vampire.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 49), 24),
                Arguments.of(new Mag("Witcher", 88), 63),
                Arguments.of(new Archer("Valco", 4), -21)
        );
    }

    @ParameterizedTest(name = "AttackHero")
    @MethodSource("provideArgumentsForAttackHero")
    void testAttackHero(Hero hero, int expected) {
        vampire.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForDrinkBlood() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 49), 39, 109),
                Arguments.of(new Mag("Witcher", 88), 78, 109),
                Arguments.of(new Archer("Valco", 4), -6, 109)
        );
    }

    @ParameterizedTest(name = "DrinkBlood")
    @MethodSource("provideArgumentsForDrinkBlood")
    void testDrinkBlood(Hero hero,int expected, int expected2) {
        vampire.drinkBlood(hero);
        int actual = hero.getHealth();
        Assertions.assertEquals(expected, actual);

        int actual2 = vampire.getHealth();
        Assertions.assertEquals(expected2, actual2);
    }
}
