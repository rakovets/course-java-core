package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarriorTest {
    @Test
    void Warrior() {
        Warrior geralt = new Warrior("Geralt", 1000);

        Assertions.assertEquals(1000, geralt.getHealth());
        Assertions.assertEquals("Geralt", geralt.getName());
    }

    @Test
    void WarriorOnlyName() {
        Warrior link = new Warrior("Link");

        Assertions.assertEquals("Link", link.getName());
        Assertions.assertEquals(100, link.getHealth());
    }

    @Test
    void setHealth() {
        Warrior geralt = new Warrior("Geralt", 1000);

        geralt.setHealth(0);

        Assertions.assertEquals(0, geralt.getHealth());
    }

    @Test
    void setHealthNegativNumber() {
        Warrior geralt = new Warrior("Geralt", 1000);

        geralt.setHealth(-100);

        Assertions.assertEquals(1000, geralt.getHealth());
    }

    @Test
    void getName() {
        Warrior geralt = new Warrior("Geralt", 1000);

        Assertions.assertEquals("Geralt", geralt.getName());
    }

    @Test
    void getHealth() {
        Warrior geralt = new Warrior("Geralt", 1000);

        Assertions.assertEquals(1000, geralt.getHealth());
    }

    static Stream<Arguments> provideArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(0, 3000),
                Arguments.of(0, 2000),
                Arguments.of(250, 1500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTakeDamage")
    void takeDamage(int expectedInt, int damage) {
        Warrior geralt = new Warrior("Geralt", 1000);

        geralt.takeDamage(damage);
        int actualInt = geralt.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(290, new Wolf(300)),
                Arguments.of(497, new Hydra(500)),
                Arguments.of(0, new Wolf(5)),
                Arguments.of(3000, new Angel(3000))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemy")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Warrior geralt = new Warrior("Geralt", 1000);

        geralt.attackEnemy(enemy);
        int actualInt = enemy.getHealth();

        Assertions.assertEquals(expectedInt, actualInt);
    }

    @Test
    void attackEnemyIfWarriorIsDead() {
        Warrior geralt = new Warrior("Geralt", 1000);
        Wolf akela = new Wolf(300);

        geralt.setHealth(0);
        geralt.attackEnemy(akela);
        int actualIntWarriorIsDead = akela.getHealth();

        Assertions.assertEquals(300, actualIntWarriorIsDead);
    }

    @Test
    void attackEnemyIfEnemyIsDead() {
        Warrior geralt = new Warrior("Geralt", 1000);
        Wolf akela = new Wolf(300);

        akela.setHealth(0);
        geralt.attackEnemy(akela);
        int actualIntWolfIsDead = akela.getHealth();

        Assertions.assertEquals(0, actualIntWolfIsDead);
    }

    @Test
    void healWounds() {
        Warrior geralt = new Warrior("Geralt", 120);

        geralt.healWounds(20);

        Assertions.assertEquals(140, geralt.getHealth());
    }

    @Test
    void healWoundsIfWarriorIsDead() {
        Warrior geralt = new Warrior("Geralt", 120);

        geralt.setHealth(0);
        geralt.healWounds(100);

        Assertions.assertEquals(0, geralt.getHealth());
    }
}
