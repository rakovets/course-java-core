package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class EnemyTest {

    @Test
    double getHealth() {
        // GIVEN
        Enemy enemy = new Enemy(500);
        double expectedDouble = 500;
        // WHEN
        double actualDouble = getHealth();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
        return expectedDouble;
    }

    @Test
    double setHealth(double health) {
        // GIVEN
        Enemy enemy = new Enemy(500);
        double expectedDouble = 600;
        // WHEN
        enemy.setHealth(600);
        double actualDouble = getHealth();
        // THAN
        Assertions.assertEquals(expectedDouble, actualDouble);
        return expectedDouble;
    }

    static Stream<Arguments> providerArgumentsForTakeDamage() {
        return Stream.of(
                Arguments.of(400, new Enemy(500))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForTakeDamage")
    void takeDamage(double expectedDouble, Enemy enemy) {
        enemy.takeDamage(100);
        double actualDouble = enemy.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

    @Test
    void isAlive() {
        // GIVEN
        Enemy enemy = new Enemy(500);
        Enemy enemy1 = new Enemy(0);
        boolean expectedBoolean = true;
        boolean expectedBoolean1 = false;
        // WHEN
        boolean actualBoolean = enemy.isAlive();
        boolean actualBoolean1 = enemy1.isAlive();
        // THAN
        Assertions.assertEquals(expectedBoolean, actualBoolean);
        Assertions.assertEquals(expectedBoolean1, actualBoolean1);
    }

    static Stream<Arguments> providerArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(181, new Enemy(500))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForAttackHero")
    void attackHero(double expectedDouble, Enemy enemy) {
        Hero hero = new Warrior("Shrek", 200);
        enemy.attackHero(hero);
        double actualDouble = hero.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

}
