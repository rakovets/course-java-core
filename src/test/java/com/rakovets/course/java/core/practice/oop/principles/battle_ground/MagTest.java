package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MagTest {
    @Test
    void Mag() {
        Mag gandalf = new Mag("Gandalf", 500);
        Assertions.assertEquals(500, gandalf.getHealth());
        Assertions.assertEquals("Gandalf", gandalf.getName());
        Mag galadriel = new Mag("Galadriel");
        Assertions.assertEquals("Galadriel", galadriel.getName());
        Assertions.assertEquals(100, galadriel.getHealth());
    }

    @Test
    void setHealth() {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.setHealth(-100);
        Assertions.assertEquals(500, gandalf.getHealth());
        gandalf.setHealth(200);
        Assertions.assertEquals(200, gandalf.getHealth());
        gandalf.setHealth(0);
        Assertions.assertEquals(0, gandalf.getHealth());
    }

    @Test
    void getName() {
        Mag gandalf = new Mag("Gandalf", 500);
        Assertions.assertEquals("Gandalf", gandalf.getName());
    }

    @Test
    void getHealth() {
        Mag gandalf = new Mag("Gandalf", 500);
        Assertions.assertEquals(500, gandalf.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(460, 20),
                Arguments.of(0, 250),
                Arguments.of(0, 1500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.takeDamage(damage);
        int actualInt = gandalf.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(270, new Wolf(300)),
                Arguments.of(490, new Hydra(500)),
                Arguments.of(0, new Angel(5)),
                Arguments.of(2985, new Angel(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.attackEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackEnemy() {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.setHealth(0);
        Angel castiel = new Angel(3000);
        gandalf.attackEnemy(castiel);
        int actualIntMagIsDead = castiel.getHealth();
        Assertions.assertEquals(3000, actualIntMagIsDead);

        gandalf.setHealth(500);
        castiel.setHealth(0);
        gandalf.attackEnemy(castiel);
        int actualIntAngelIsDead = castiel.getHealth();

        Assertions.assertEquals(0, actualIntAngelIsDead);
    }

    static Stream<Arguments> provideArgumentsForCurseEnemy() {
        return Stream.of(
                Arguments.of(0, new Wolf(300)),
                Arguments.of(0, new Hydra(500)),
                Arguments.of(5, new Angel(5)),
                Arguments.of(3000, new Angel(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCurseEnemy")
    void curseEnemy(int expectedInt, Enemy enemy) {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.curseEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void curseEnemy() {
        Mag gandalf = new Mag("Gandalf", 500);
        gandalf.setHealth(0);
        Wolf akela = new Wolf(300);
        gandalf.curseEnemy(akela);
        int actualIntMagIsDead = akela.getHealth();
        Assertions.assertEquals(300, actualIntMagIsDead);

        gandalf.setHealth(500);
        akela.setHealth(0);
        gandalf.attackEnemy(akela);
        int actualIntWolfIsDead = akela.getHealth();

        Assertions.assertEquals(0, actualIntWolfIsDead);
    }

    @Test
    void resurrectHero() {
        Mag gandalf = new Mag("Gandalf", 500);
        Warrior aragorn = new Warrior("Aragorn");
        aragorn.setHealth(0);
        gandalf.resurrectHero(aragorn);
        int actualInt = aragorn.getHealth();

        Assertions.assertEquals(100, actualInt);

        gandalf.setHealth(0);
        aragorn.setHealth(0);
        gandalf.resurrectHero(aragorn);
        int actualIntMagIsDead = aragorn.getHealth();

        Assertions.assertEquals(0, actualIntMagIsDead);

        aragorn.setHealth(300);
        gandalf.setHealth(500);
        gandalf.resurrectHero(aragorn);
        int actualIntAragornIsAlive = aragorn.getHealth();

        Assertions.assertEquals(300, actualIntAragornIsAlive);
    }
}
