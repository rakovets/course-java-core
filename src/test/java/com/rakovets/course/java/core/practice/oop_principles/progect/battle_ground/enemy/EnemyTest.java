package com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.enemy;

import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Archer;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Hero;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Mag;
import com.rakovets.course.java.core.practice.oop_principles.progect.battle_ground.hero.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EnemyTest {
    Archer archer = new Archer("", 0);
    Mag mag = new Mag("", 0);
    Warrior warrior = new Warrior("", 0);
    static Enemy enemy;

    @BeforeAll
    static void beforeAll() {
        enemy = new Enemy(0) {
            @Override
            protected void attackHero(Hero hero) {
                hero.takingDamage(0);
            }
        };
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

    static Stream<Arguments> enemyTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(40, 20),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageArcherProviderArguments")
    void enemyTakingDamageArcher(int health, int expected) {
        enemy.setHealth(health);

        enemy.takingDamage(archer.getDamageArcher());
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(0, 0),
                Arguments.of(40, 0),
                Arguments.of(20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageArcherBoostShotProviderArguments")
    void enemyTakingDamageArcherBoostShot(int health, int expected) {
        enemy.setHealth(health);

        enemy.takingDamage(archer.getBoostShot());
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 83),
                Arguments.of(50, 33),
                Arguments.of(0, 0),
                Arguments.of(40, 23),
                Arguments.of(17, 0),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageMagProviderArguments")
    void enemyTakingDamageMag(int health, int expected) {
        enemy.setHealth(health);

        enemy.takingDamage(mag.getDamageMag());
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 76),
                Arguments.of(50, 26),
                Arguments.of(0, 0),
                Arguments.of(40, 16),
                Arguments.of(26, 2),
                Arguments.of(10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageWarriorProviderArguments")
    void enemyTakingDamageWarrior(int health, int expected) {
        enemy.setHealth(health);

        enemy.takingDamage(warrior.getDamageWarrior());
        int actual = enemy.getHealth();

        Assertions.assertEquals(expected, actual);
    }

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
}
