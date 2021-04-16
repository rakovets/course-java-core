package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_battle;

import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Mag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MagTest {

    static Stream<Arguments> provideArgumentsForAttackEnemyOfMag() {
        return Stream.of(
                Arguments.of(300, 280),
                Arguments.of(250, 230),
                Arguments.of(20, 0),
                Arguments.of(0, 0)
        );
    }

    static Stream<Arguments> provideArgumentsForDead() {
        return Stream.of(
                Arguments.of(300, 200, 200),
                Arguments.of(250,400, 400),
                Arguments.of(20, 10, 10),
                Arguments.of(100, 5, 5)
        );
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForAttackEnemyOfMag")
    void attackEnemyOfArcherTest(int health, int expected) {
        Enemy enemy = new Enemy(health);
        Mag archer = new Mag();
        int actual = archer.attackEnemy(enemy);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForDead")
    void attackRefuseHealthTest(int health, int indicatorHealth, int expected) {
        Enemy enemy = new Enemy(health);
         Mag mag = new Mag();
        mag.setIndicatorHealth(indicatorHealth);
        int actual = mag.dead(enemy);
        Assertions.assertEquals(expected, actual);
    }
}
