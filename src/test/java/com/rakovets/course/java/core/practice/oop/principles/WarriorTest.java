package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    static Stream<Arguments> providerArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(385, new Warrior("Shrek", 500))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForAttackEnemy")
    void attackEnemy(double expectedDouble, Warrior warrior) {
        Enemy enemy = new Enemy(400);
        warrior.attackEnemy(enemy);
        double actualDouble = enemy.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    static Stream<Arguments> providerArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(411, new Warrior("Shrek", 500))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForTakeDamage")
    void takeDamage(double expectedDouble, Warrior warrior) {
        Enemy enemy = new Enemy(400);
        warrior.takeDamage(90);
        double actualDouble = warrior.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }
}
