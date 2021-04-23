package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GolemTest {
    @Test
    void Golem() {
        Assertions.assertEquals(500, new Golem(500).getHealth());
    }

    @Test
    void setHealth() {
        Golem wrath = new Golem(500);

        wrath.setHealth(0);

        Assertions.assertEquals(0, wrath.getHealth());
    }

    @Test
    void getHealth() {
        Golem wrath = new Golem(500);

        Assertions.assertEquals(500, wrath.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(496, 20),
                Arguments.of(470, 150),
                Arguments.of(200, 1500),
                Arguments.of(0, 2500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Golem wrath = new Golem(500);

        wrath.takeDamage(damage);
        int actualInt = wrath.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(288, new Warrior("Gimli", 300)),
                Arguments.of(250, new Mag("Gandalf", 300)),
                Arguments.of(50, new Mag("Gandalf", 100)),
                Arguments.of(275, new Archer("Legolas", 300))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Hero hero) {
        Golem wrath = new Golem(500);

        wrath.attackHero(hero);
        int actualInt = hero.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void splashAttackHero() {
        Golem wrath = new Golem(500);
        Archer hero1 = new Archer("Bard", 500);

        wrath.splashAttack(hero1, hero1, hero1);
        int actualIntHero1 = hero1.getHealth();

        Assertions.assertEquals(425, actualIntHero1);
    }
}
