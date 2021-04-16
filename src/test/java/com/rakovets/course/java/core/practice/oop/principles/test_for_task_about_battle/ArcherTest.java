package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_battle;

import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Archer;
import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArcherTest {

    static Stream<Arguments> provideArgumentsForAttackEnemyWithArcher() {
        return Stream.of(
                Arguments.of(300, 265),
                Arguments.of(250, 215),
                Arguments.of(20, 0),
                Arguments.of(0, 0)
        );
    }

    static Stream<Arguments> provideArgumentsForAttackReduceHealth() {
        return Stream.of(
                Arguments.of(300, 200, 180),
                Arguments.of(250,400, 380),
                Arguments.of(20, 10, 10),
                Arguments.of(100, 5, 5)
        );
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForAttackEnemyWithArcher")
    void attackEnemyWithArcherTest(int health, int expected) {
        Enemy enemy = new Enemy(health);
        Archer archer = new Archer();
        int actual = archer.attackEnemy(enemy);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForAttackReduceHealth")
    void attackReduceHealthTest(int health, int indicatorHealth, int expected) {
        Enemy enemy = new Enemy(health);
        Archer archer = new Archer();
        archer.setIndicatorHealth(indicatorHealth);
        int actual = archer.reduceOwnHealth(enemy);
        Assertions.assertEquals(expected, actual);
    }
}
