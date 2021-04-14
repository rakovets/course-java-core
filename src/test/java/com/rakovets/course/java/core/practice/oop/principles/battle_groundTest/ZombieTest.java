package com.rakovets.course.java.core.practice.oop.principles.battle_groundTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ZombieTest {
    static Hero hero = new Hero("Hero", 100) {
        @Override
        public void attackEnemy(Enemy enemy) {
            System.out.println("Hero attacks!");
        }
    };

    static Stream<Arguments> attackEnemyTest() {
        return Stream.of(
                Arguments.of(98, hero));
    }

    @ParameterizedTest
    @MethodSource("attackEnemyTest")
    void attackEnemyTest(int expected, Hero hero) {
        Zombie zombie = new Zombie(100);
        zombie.attackEnemy(hero);
        assertEquals(expected, hero.getHealth());
    }

    static Stream<Arguments> poisonTest() {
        return Stream.of(
                Arguments.of(88, hero));
    }

    @ParameterizedTest
    @MethodSource("poisonTest")
    void poisonTest(int expected, Hero hero) {
        Zombie zombie = new Zombie(100);
        hero.setHealth(100);
        zombie.poison(hero);
        assertEquals(expected, hero.getHealth());
    }
}
