package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EnemyTest {
    final Enemy enemy = new Enemy(0) {
        @Override
        protected void attackEnemy(Hero hero) {
            hero.takingDamage(0);
        }
    };

    static Stream<Arguments> enemyIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true),
                Arguments.of(1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyIsAliveProviderArguments")
    void enemyIsAlive(int health, boolean expected) {
        enemy.setHealth(health);

        boolean actual = enemy.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 50, 0),
                Arguments.of(0, 40, 0),
                Arguments.of(40, 60, 0),
                Arguments.of(450, 200, 250)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageProviderArguments")
    void enemyTakingDamage(int health, int damage, int expected) {
        enemy.setHealth(health);

        enemy.takingDamage(damage);
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }
}
