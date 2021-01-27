package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AngelTest {
    @Test
    void Angel() {
        Assertions.assertEquals(1000, new Angel(1000).getHealth());
    }

    @Test
    void setHealth() {
        Angel castiel = new Angel(1000);
        castiel.setHealth(500);
        Assertions.assertEquals(500, castiel.getHealth());
    }

    @Test
    void getHealth() {
        Angel castiel = new Angel(1000);
        Assertions.assertEquals(1000, castiel.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(1000, 20),
                Arguments.of(0, 2500),
                Arguments.of(980, 40)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Angel castiel = new Angel(1000);
        castiel.takeDamage(damage);
        int actualInt = castiel.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }


    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(275, new Warrior("Geralt", 300)),
                Arguments.of(200, new Mag("Dambldor", 300)),
                Arguments.of(250, new Archer("Legolas", 300))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Hero hero) {
        Angel castiel = new Angel(1000);
        castiel.attackHero(hero);
        int actualInt = hero.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackHero() {
        Angel castiel = new Angel(1000);
        castiel.setHealth(0);
        Archer bard = new Archer("Bard", 300);
        castiel.attackHero(bard);
        int actualIntAngelIsDead = bard.getHealth();
        Assertions.assertEquals(300, actualIntAngelIsDead);

        castiel.setHealth(500);
        bard.setHealth(0);
        castiel.attackHero(bard);
        int actualIntBardIsDead = bard.getHealth();

        Assertions.assertEquals(0, actualIntBardIsDead);
    }

    @Test
    void resurrectEnemy() {
        Angel castiel = new Angel(1000);
        Hydra wrath = new Hydra(300);
        wrath.setHealth(0);
        castiel.resurrectEnemy(wrath);
        int actualInt = wrath.getHealth();

        Assertions.assertEquals(30, actualInt);

        castiel.setHealth(0);
        wrath.setHealth(0);
        castiel.resurrectEnemy(wrath);
        int actualIntAngelIsDead = wrath.getHealth();

        Assertions.assertEquals(0, actualIntAngelIsDead);

        wrath.setHealth(300);
        castiel.setHealth(500);
        castiel.resurrectEnemy(wrath);
        int actualIntHydraIsAlive = wrath.getHealth();

        Assertions.assertEquals(300, actualIntHydraIsAlive);
    }
}
