package com.rakovets.course.java.core.practice.oop.principles.battle_ground;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

class WarriorTest {
    static Enemy enemy = new Enemy(100) {
        @Override
        public void attackEnemy(Hero hero) {
            System.out.println("Enemy attacks!");
        }
    };

    static Stream<Arguments> attackEnemyTest() {
        return Stream.of(
                Arguments.of(95, enemy));
    }

    @ParameterizedTest
    @MethodSource("attackEnemyTest")
    void attackEnemyTest(int expected, Enemy enemy) {
        Warrior warrior = new Warrior("Warrior", 50);
        warrior.attackEnemy(enemy);
        assertEquals(expected, enemy.getHealth());
    }

    static Stream<Arguments> doomPunchTest() {
        return Stream.of(
                Arguments.of(65, enemy));
    }

    @ParameterizedTest
    @MethodSource("doomPunchTest")
    void doomPunchTest(int expected, Enemy enemy) {
        Warrior warrior = new Warrior("Warrior", 50);
        enemy.setHealth(100);
        warrior.doomPunch(enemy);
        assertEquals(expected, enemy.getHealth());
    }

}
