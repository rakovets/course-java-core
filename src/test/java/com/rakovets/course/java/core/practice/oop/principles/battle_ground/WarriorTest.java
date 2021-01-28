package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

class WarriorTest {

    static Stream<Arguments> attackEnemyProviderArguments() {
        return Stream.of(
                Arguments.of(-50, new Enemy(100))
        );
    }

    @ParameterizedTest
    @MethodSource("attackEnemyProviderArguments")
    void attackEnemy(int expectedDouble, Enemy enemy) {
        Warrior warrior = new Warrior("Warrior", 50);
        warrior.attackEnemy(enemy);
        assertEquals(expectedDouble, enemy.takeDamage(50));
    }
}
