package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    static Stream<Arguments> providerArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(75, new Archer( "Shrek", 500)),
                Arguments.of(65, new Archer( "Shrek", 240))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForAttackEnemy")
    void attackEnemy(double expectedDouble, Archer archer) {
        Enemy enemy = new Enemy(100);
        if (archer.getHealth() < 250) {
            enemy.takeDamage(35);
        } else {
            enemy.takeDamage(25);
        }
        double actualDouble = enemy.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    void attackEnemy() {
    }

    @Test
    void testAttackEnemy() {
    }
}
