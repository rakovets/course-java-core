package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArcherTest {

    static Stream<Arguments> attackEnemyProviderArguments() {
        return Stream.of(
                Arguments.of(0, new Enemy(100))
        );
    }

    @ParameterizedTest
    @MethodSource("attackEnemyProviderArguments")
    void attackEnemy(int expectedInt, Enemy enemy) {
        Archer archer = new Archer("Archer", 50);
        archer.attackEnemy(enemy);
        assertEquals(expectedInt, enemy.takeDamage(50));
    }

    @Test
    void addHealth() {
        assertEquals(450, new Archer("Archer", -50).addHealth());
    }
}
