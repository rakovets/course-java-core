package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HydraTest {
    @Test
    void Hydra() {
        Assertions.assertEquals(500, new Hydra(500).getHealth());
    }

    @Test
    void setHealth() {
        Hydra wrath = new Hydra(500);
        wrath.setHealth(200);
        Assertions.assertEquals(200, wrath.getHealth());
    }

    @Test
    void getHealth() {
        Hydra wrath = new Hydra(500);
        Assertions.assertEquals(500, wrath.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(494, 20),
                Arguments.of(450, 150),
                Arguments.of(0, 1500),
                Arguments.of(0, 2500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Hydra wrath = new Hydra(500);
        wrath.takeDamage(damage);
        int actualInt = wrath.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(290, new Warrior("Geralt", 300)),
                Arguments.of(260, new Mag("Dambldor", 300)),
                Arguments.of(0, new Mag("Dambldor", 30)),
                Arguments.of(280, new Archer("Legolas", 300))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Hero hero) {
        Hydra wrath = new Hydra(500);
        wrath.attackHero(hero);
        int actualInt = hero.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackHero() {
        Hydra wrath = new Hydra(500);
        wrath.setHealth(0);
        Archer bard = new Archer("Bard", 300);
        wrath.attackHero(bard);
        int actualIntHydraIsDead = bard.getHealth();
        Assertions.assertEquals(300, actualIntHydraIsDead);

        wrath.setHealth(500);
        bard.setHealth(0);
        wrath.attackHero(bard);
        int actualIntBardIsDead = bard.getHealth();

        Assertions.assertEquals(0, actualIntBardIsDead);
    }

    @Test
    void attackMultiplyHero() {
        Hydra wrath = new Hydra(500);
        Archer hero1 = new Archer("Bard", 500);
        Warrior hero2 = new Warrior("Aragorn", 1000);
        Mag hero3 = new Mag("Gandalf", 500);
        wrath.attackMultiplyHero(hero1, hero2, hero3);
        int actualIntHero1 = hero1.getHealth();
        int actualIntHero2 = hero2.getHealth();
        int actualIntHero3 = hero3.getHealth();

        Assertions.assertEquals(480, actualIntHero1);
        Assertions.assertEquals(990, actualIntHero2);
        Assertions.assertEquals(460, actualIntHero3);

        wrath.setHealth(0);
        wrath.attackMultiplyHero(hero1, hero2, hero3);
        int actualIntHero1HydraIsDead = hero1.getHealth();
        int actualIntHero2HydraIsDead = hero2.getHealth();
        int actualIntHero3HydraIsDead = hero3.getHealth();
        Assertions.assertEquals(480, actualIntHero1HydraIsDead);
        Assertions.assertEquals(990, actualIntHero2HydraIsDead);
        Assertions.assertEquals(460, actualIntHero3HydraIsDead);

        wrath.setHealth(500);
        hero3.setHealth(0);
        wrath.attackMultiplyHero(hero1, hero2, hero3);
        int actualIntHero1HeroIsDead = hero1.getHealth();
        int actualIntHero2HeroIsDead = hero2.getHealth();
        int actualIntHero3HeroIsDead = hero3.getHealth();
        Assertions.assertEquals(480, actualIntHero1HeroIsDead);
        Assertions.assertEquals(990, actualIntHero2HeroIsDead);
        Assertions.assertEquals(0, actualIntHero3HeroIsDead);
    }
}
