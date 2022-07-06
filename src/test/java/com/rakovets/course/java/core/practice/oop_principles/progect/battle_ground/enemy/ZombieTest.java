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

public class ZombieTest {
    Zombie zombie = new Zombie(0, 0);
    Archer archer = new Archer("", 0, 0);
    Mag mag = new Mag("", 0, 0);
    Warrior warrior = new Warrior("", 0, 0);
    static Hero hero;

    @BeforeAll
    static void beforeAll() {
        hero = new Hero("", 0, 0) {
            @Override
            protected void attackEnemy(Enemy enemy) {
                enemy.takeDamage(0);
            }
        };
    }

    static Stream<Arguments> zombieAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackArcherProvideArguments")
    void zombieAttackArcher(int health, int damage, int expected) {
        archer.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        zombie.attackHero(archer);
        int actual = archer.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieAttackHeroProvideArguments() {
        return Stream.of(
                Arguments.of(100, 12, 88),
                Arguments.of(50, 12, 38),
                Arguments.of(0, 12, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackHeroProvideArguments")
    void zombieAttackHero(int health, int damage, int expected) {
        hero.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        zombie.attackHero(hero);
        int actual = hero.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(100, 12, 100),
                Arguments.of(50, 12, 50),
                Arguments.of(0, 12, 0),
                Arguments.of(450, 12, 438)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackMagProvideArguments")
    void zombieAttackMag(int health, int damage, int expected) {
        mag.setHealthHero(health);
        zombie.setDamageEnemy(damage);

        zombie.attackHero(mag);
        int actual = mag.getHealthHero();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 70, 0),
                Arguments.of(0, 40, 0),
                Arguments.of(10, 5, 5),
                Arguments.of(500, 350, 150),
                Arguments.of(50, 15, 35)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageProviderArguments")
    void zombieTakingDamage(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);

        zombie.takeDamage(damage);
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 80),
                Arguments.of(50, 20, 30),
                Arguments.of(0, 0, 0),
                Arguments.of(25, 20, 5),
                Arguments.of(500, 20, 480),
                Arguments.of(1, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageArcherProviderArguments")
    void zombieTakingDamageArcher(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        archer.setDamageHero(damage);

        zombie.takeDamage(archer.getDamageHero());
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 20, 60),
                Arguments.of(50, 20, 10),
                Arguments.of(0, 0, 0),
                Arguments.of(25, 20, 0),
                Arguments.of(500, 20, 460),
                Arguments.of(2, 20, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageArcherBoostShotProviderArguments")
    void zombieTakingDamageArcherBoostShot(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        archer.setDamageHero(damage);

        zombie.takeDamage(archer.boostedShot());
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageMageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 17, 83),
                Arguments.of(50, 17, 33),
                Arguments.of(0, 0, 0),
                Arguments.of(25, 17, 8),
                Arguments.of(500, 17, 483),
                Arguments.of(2, 17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageMageProviderArguments")
    void zombieTakingDamageMage(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        mag.setDamageHero(damage);

        zombie.takeDamage(mag.getDamageHero());
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 24, 76),
                Arguments.of(50, 24, 26),
                Arguments.of(0, 0, 0),
                Arguments.of(500, 24, 476),
                Arguments.of(2, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageWarriorProviderArguments")
    void zombieTakingDamageWarrior(int health, int damage, int expected) {
        zombie.setHealthEnemy(health);
        warrior.setDamageHero(damage);

        zombie.takeDamage(warrior.getDamageHero());
        int actual = zombie.getHealthEnemy();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieIsAliveProviderArguments() {
        return Stream.of(
                Arguments.of(100, true),
                Arguments.of(0, false),
                Arguments.of(50, true)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieIsAliveProviderArguments")
    void zombieIsAlive(int health, boolean expected) {
        zombie.setHealthEnemy(health);

        boolean actual = zombie.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
