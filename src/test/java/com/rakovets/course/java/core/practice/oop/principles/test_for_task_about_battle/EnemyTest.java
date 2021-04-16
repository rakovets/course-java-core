package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_battle;

import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EnemyTest {

    static Stream<Arguments> provideArgumentsForDamage() {
        return Stream.of(
                Arguments.of(80, 20, 60),
                Arguments.of(100, 50, 50),
                Arguments.of(20, 50, 0),
                Arguments.of(100, 0, 100)
        );
    }

    static Stream<Arguments> provideArgumentsForIsAlive() {
        return Stream.of(
                Arguments.of(80, true),
                Arguments.of(120, true),
                Arguments.of(0, false),
                Arguments.of(-5, false)
        );
    }

    @ParameterizedTest(name = "Health - {0}, damage = {1}, Expected: {2}")
    @MethodSource("provideArgumentsForDamage")
    void damageEnemyTest(int health, int damage, int expected) {
        Enemy enemy = new Enemy(health);
        int actual = enemy.takeDamage(damage);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForIsAlive")
    void isAliveTest(int health, boolean expected) {
        Enemy enemy = new Enemy(health);
        boolean actual = enemy.isAlive();
        Assertions.assertEquals(expected, actual);
    }
}

