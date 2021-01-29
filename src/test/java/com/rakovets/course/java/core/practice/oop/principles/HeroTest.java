package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void getName() {
        Warrior warrior = new Warrior("Vasya", 100);
        String expected = "Vasya";

        String actual = warrior.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getHealth() {
        Warrior warrior = new Warrior("Vasya", 100);
        int expected = 100;

        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHealth() {
        Warrior warrior = new Warrior("Vasya", 100);
        warrior.setHealth(10);
        int expected = 10;

        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsAliveMethod() {
        return Stream.of(
                Arguments.of(true, 1),
                Arguments.of(false, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForIsAliveMethod")
    void IsAlive(boolean expected, int health) {
        Mag mag = new Mag("Jon", health);

        boolean actual = mag.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void takeDamage() {
        Warrior warrior = new Warrior("Vasya", 100);
        warrior.takeDamage(10);
        int expected = 90;

        int actual = warrior.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackEnemyMethod() {
        return Stream.of(
                Arguments.of(83, 100),
                Arguments.of(73, 90)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackEnemyMethod")
    void attackEnemy(int expected, int health) {
        Mag mag = new Mag("Jon", 100);
        Enemy enemy = new Enemy(health);

        mag.attackEnemy(enemy);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
