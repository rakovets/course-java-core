package com.rakovets.course.java.core.practice.oop.principles.battle_groundTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

class ArcherTest {
    static Enemy enemy = new Enemy(100) {
        @Override
        public void attackEnemy(Hero hero) {
            System.out.println("Enemy attacks!");
        }
    };

    static Stream<Arguments> attackEnemyTest() {
        return Stream.of(
                Arguments.of(85, enemy));
    }

    @ParameterizedTest
    @MethodSource("attackEnemyTest")
    void attackEnemyTest(int expected, Enemy enemy) {
        enemy.setHealth(100);
        Archer archer = new Archer("Archer", 100);
        archer.attackEnemy(enemy);
        assertEquals(expected, enemy.getHealth());
    }

    static Stream<Arguments> rainOfArrowsTest() {
        return Stream.of(
                Arguments.of(55, enemy));
    }

    @ParameterizedTest
    @MethodSource("rainOfArrowsTest")
    void rainOfArrowsTest(int expected, Enemy enemy) {
        Archer archer = new Archer("Archer", 100);
        enemy.setHealth(100);
        archer.rainOfArrows(enemy);
        assertEquals(expected, enemy.getHealth());
    }
}
