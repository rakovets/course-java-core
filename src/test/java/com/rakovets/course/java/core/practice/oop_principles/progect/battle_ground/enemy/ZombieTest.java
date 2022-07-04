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
    Zombie zombie = new Zombie(0);
    Archer archer = new Archer("", 0);
    Mag mag = new Mag("", 0);
    Warrior warrior = new Warrior("", 0);
    static Hero hero;

    @BeforeAll
    static void beforeAll() {
        hero = new Hero("", 0) {
            @Override
            protected void attackEnemy(Enemy enemy) {
                enemy.takingDamage(0);
            }
        };
    }

    static Stream<Arguments> zombieAttackArcherProvideArguments() {
        return Stream.of(
                Arguments.of(100, 88),
                Arguments.of(50, 38),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackArcherProvideArguments")
    void zombieAttackArcher(int health, int expected) {
        archer.setHealth(health);

        zombie.attackHero(archer);
        int actual = archer.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieAttackHeroProvideArguments() {
        return Stream.of(
                Arguments.of(100, 88),
                Arguments.of(50, 38),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackHeroProvideArguments")
    void zombieAttackHero(int health, int expected) {
        hero.setHealth(health);

        zombie.attackHero(hero);
        int actual = hero.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieAttackMagProvideArguments() {
        return Stream.of(
                Arguments.of(100, 113),
                Arguments.of(50, 63),
                Arguments.of(0, 0),
                Arguments.of(450, 438)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieAttackMagProvideArguments")
    void zombieAttackMag(int health, int expected) {
        mag.setHealth(health);

        zombie.attackHero(mag);
        int actual = mag.getHealth();

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
        zombie.setHealth(health);

        zombie.takingDamage(damage);
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageArcherProviderArguments() {
        return Stream.of(
                Arguments.of(100, 80),
                Arguments.of(50, 30),
                Arguments.of(0, 0),
                Arguments.of(25, 5),
                Arguments.of(500, 480),
                Arguments.of(2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageArcherProviderArguments")
    void zombieTakingDamageArcher(int health, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(archer.getDamageArcher());
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageArcherBoostShotProviderArguments() {
        return Stream.of(
                Arguments.of(100, 60),
                Arguments.of(50, 10),
                Arguments.of(0, 0),
                Arguments.of(25, 0),
                Arguments.of(500, 460),
                Arguments.of(2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageArcherBoostShotProviderArguments")
    void zombieTakingDamageArcherBoostShot(int health, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(archer.getBoostShot());
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageMageProviderArguments() {
        return Stream.of(
                Arguments.of(100, 83),
                Arguments.of(50, 33),
                Arguments.of(0, 0),
                Arguments.of(25, 8),
                Arguments.of(500, 483),
                Arguments.of(2, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageMageProviderArguments")
    void zombieTakingDamageMage(int health, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(mag.getDamageMag());
        int actual = zombie.getHealth();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> zombieTakingDamageWarriorProviderArguments() {
        return Stream.of(
                Arguments.of(100, 76),
                Arguments.of(50, 26),
                Arguments.of(0, 0),
                Arguments.of(500, 476),
                Arguments.of(2, 0),
                Arguments.of(17, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("zombieTakingDamageWarriorProviderArguments")
    void zombieTakingDamageWarrior(int health, int expected) {
        zombie.setHealth(health);

        zombie.takingDamage(warrior.getDamageWarrior());
        int actual = zombie.getHealth();

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
        zombie.setHealth(health);

        boolean actual = zombie.isAlive();

        Assertions.assertEquals(expected, actual);
    }
}
