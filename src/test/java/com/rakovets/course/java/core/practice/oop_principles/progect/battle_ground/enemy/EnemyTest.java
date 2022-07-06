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
    Archer archer = new Archer("", 0, 0);
    Mag mag = new Mag("", 0, 0);
    Warrior warrior = new Warrior("", 0, 0);
    static Enemy enemy;

    @BeforeAll
    static void beforeAll() {
        enemy = new Enemy(0, 0) {
            @Override
            protected void attackHero(Hero hero) {
                hero.takeDamage(getDamageEnemy());
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
        enemy.setHealthEnemy(health);

        enemy.takeDamage(damage);
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 20, 20),
                Arguments.of(20, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageArcherProviderArguments")
    void enemyTakingDamageArcher(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        archer.setDamageHero(damage);

        enemy.takeDamage(archer.getDamageHero());
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 20, 0),
                Arguments.of(20, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageArcherBoostShotProviderArguments")
    void enemyTakingDamageArcherBoostShot(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        archer.setDamageHero(damage);

        enemy.takeDamage(archer.boostedShot());
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageMagProviderArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 17, 23),
                Arguments.of(17, 17, 0),
                Arguments.of(10, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageMagProviderArguments")
    void enemyTakingDamageMag(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        mag.setDamageHero(damage);

        enemy.takeDamage(mag.getDamageHero());
        int actual = enemy.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> enemyTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(0, 0, 0),
                Arguments.of(40, 24, 16),
                Arguments.of(26, 24, 2),
                Arguments.of(10, 24, 0),
                Arguments.of(24, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("enemyTakingDamageWarriorProviderArguments")
    void enemyTakingDamageWarrior(int health, int damage, int expected) {
        enemy.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        enemy.takeDamage(warrior.getDamageHero());
        int actual = enemy.getHealthEnemy();

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
        enemy.setHealthEnemy(health);

        boolean actual = enemy.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
