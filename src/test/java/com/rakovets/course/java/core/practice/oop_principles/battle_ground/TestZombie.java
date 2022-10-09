package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestZombie {
    Zombie zombie = new Zombie(79);

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(35, 44),
                Arguments.of(0, 79),
                Arguments.of(-10, 89)
        );
    }

    @ParameterizedTest(name = "TakeDamage")
    @MethodSource("provideArgumentsForTakeDamage")
    void testTakeDamage(int damage, int expected) {
        zombie.takeDamage(damage);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(new Zombie( 58), true),
                Arguments.of(new Zombie( 0), false),
                Arguments.of(new Zombie( -1), false)
        );
    }

    @ParameterizedTest(name = "IsAlive")
    @MethodSource("provideArgumentsForIsAlive")
    void testIsAlive(Zombie zombie, boolean expected) {
        boolean actual = zombie.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(new Warrior("Viserious", 49), 9),
                Arguments.of(new Mag("Witcher", 88), 48),
                Arguments.of(new Archer("Valco", 4), -36)
        );
    }

    @ParameterizedTest(name = "AttackHero")
    @MethodSource("provideArgumentsForAttackHero")
    void testAttackHero(Hero hero, int expected) {
        zombie.attackHero(hero);
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
}
