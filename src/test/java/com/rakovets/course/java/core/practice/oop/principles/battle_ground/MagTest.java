package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagTest {

    static Stream<Arguments> attackEnemyProviderArguments() {
        return Stream.of(
                Arguments.of(-20, new Enemy(100))
        );
    }

    @ParameterizedTest
    @MethodSource("attackEnemyProviderArguments")
    void attackEnemy(int expectedDouble, Enemy enemy) {
        Mag mag = new Mag("Mag", 50);
        mag.attackEnemy(enemy);
        assertEquals(expectedDouble, enemy.takeDamage(50));
    }

    @Test
    void addHealth() {
        assertEquals(100, new Mag("Mag", -50).addHealth());
    }
}

