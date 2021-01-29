package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void getHealth() {
        Enemy enemy = new Enemy(100);
        int expected = 100;

        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHealth() {
        Enemy enemy = new Enemy(100);
        enemy.setHealth(50);
        int expected = 50;

        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void takeDamage() {
        Enemy enemy = new Enemy(100);
        enemy.takeDamage(10);
        int expected = 90;

        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForIsAliveMethod() {
        return Stream.of(
                Arguments.of(true, 1),
                Arguments.of(false, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForIsAliveMethod")
    void IsAlive(boolean expected, int health) {
        Enemy enemy = new Enemy(health);

        boolean actual = enemy.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ProvideArgumentsForAttackHeroMethod() {
        return Stream.of(
                Arguments.of(78, 100),
                Arguments.of(68, 90)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForAttackHeroMethod")
    void attackHero(int expected, int health) {
        Mag mag = new Mag("Jon", health);
        Enemy enemy = new Enemy(100);

        enemy.attackHero(mag);
        int actual = mag.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
