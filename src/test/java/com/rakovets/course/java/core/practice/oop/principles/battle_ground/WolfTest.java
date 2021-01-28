package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WolfTest {
    @Test
    void Wolf() {
        Assertions.assertEquals(100, new Wolf(100).getHealth());
    }

    @Test
    void setHealth() {
        Wolf akela = new Wolf(100);

        akela.setHealth(200);

        Assertions.assertEquals(200, akela.getHealth());
    }

    @Test
    void getHealth() {
        Wolf akela = new Wolf(100);

        Assertions.assertEquals(100, akela.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(80, 20),
                Arguments.of(0, 150),
                Arguments.of(0, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Wolf akela = new Wolf(100);

        akela.takeDamage(damage);
        int actualInt = akela.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(290, new Wolf( 100)),
                Arguments.of(270, new Wolf(34))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void attackHero(int expectedInt, Wolf wolf) {
        Archer legolas = new Archer("Legolas", 300);

        wolf.attackHero(legolas);
        int actualInt = legolas.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackHeroIfWolfIsDead() {
        Wolf akela = new Wolf(100);
        Archer bard = new Archer("Bard", 300);

        akela.setHealth(0);
        akela.attackHero(bard);
        int actualIntWolfIsDead = bard.getHealth();

        Assertions.assertEquals(300, actualIntWolfIsDead);
    }

    @Test
    void attackHeroIfHeroIsDead() {
        Wolf akela = new Wolf(100);
        Archer bard = new Archer("Bard", 300);

        bard.setHealth(0);
        akela.attackHero(bard);
        int actualIntBardIsDead = bard.getHealth();

        Assertions.assertEquals(0, actualIntBardIsDead);
    }

    @Test
    void healWounds()  {
        Wolf akela = new Wolf(10);

        akela.healWounds();

        Assertions.assertEquals(30, akela.getHealth());
    }

    @Test
    void healWoundsIfHealthIsUnderCriticalHealthPoint()  {
        Wolf akela = new Wolf(100);

        akela.healWounds();

        Assertions.assertEquals(100, akela.getHealth());
    }

    @Test
    void healWoundsIfWolfIsDead()  {
        Wolf akela = new Wolf(10);

        akela.setHealth(0);
        akela.healWounds();

        Assertions.assertEquals(0, akela.getHealth());
    }
}
