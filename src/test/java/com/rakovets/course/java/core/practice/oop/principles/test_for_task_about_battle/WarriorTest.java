package com.rakovets.course.java.core.practice.oop.principles.test_for_task_about_battle;

import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Enemy;
import com.rakovets.course.java.core.practice.oop.principles.task_about_battle.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WarriorTest {

    static Stream<Arguments> provideArgumentsForAttackEnemyOfWarrior() {
        return Stream.of(
                Arguments.of(300, 285),
                Arguments.of(250, 235),
                Arguments.of(20, 5),
                Arguments.of(0, 0)
        );
    }

    static Stream<Arguments> provideArgumentsForAsk() {
        return Stream.of (
                Arguments.of(300, "Help, please!!!"),
                Arguments.of(250, "Help, please!!!"),
                Arguments.of(20, "Help, please!!!"),
                Arguments.of(5, "Help, please!!!")
        );
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForAttackEnemyOfWarrior")
    void attackEnemyOfWarriorTest(int health, int expected) {
        Enemy enemy = new Enemy(health);
        Warrior warrior = new Warrior();
        int actual = warrior.attackEnemy(enemy);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Health - {0}, Expected: {1}")
    @MethodSource("provideArgumentsForAsk")
    void askTest(int health, String expected) {
        Enemy enemy = new Enemy(health);
        Warrior warrior = new Warrior();
        String actual = warrior.askForHelp(enemy);
        Assertions.assertEquals(expected, actual);
    }
}

