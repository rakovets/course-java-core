package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HeroTest {
    Hero hero = new Hero("", 0) {
        @Override
        protected void attackEnemy(Enemy enemy) {
            hero.attackEnemy(enemy);
        }
    };

    static Stream<Arguments> isAliveHeroProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isAliveHeroProviderArguments")
    void isAliveHero(int health, boolean expected) {
        hero.setHealth(health);

        boolean actual = hero.isAlive();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> takingDamageHeroProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80, 20),
                Arguments.of(0, 10, 0),
                Arguments.of(50, 20, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("takingDamageHeroProviderArguments")
    void takingDamageHero(int health, int damage, int expected) {
        hero.setHealth(health);

        int actual = hero.takingDamage(damage);

        Assertions.assertEquals(expected, actual);
    }
}
